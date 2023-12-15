package com.mydeenAbdul_ZSGS.interviewPanal.repository;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

import com.mydeenAbdul_ZSGS.interviewPanal.dto.Candidate;

public class InterviewRepository {

	private static InterviewRepository interviewRepository;
	private Queue<Candidate> candidates = new LinkedList<Candidate>();
	private Object lock=new Object();
	private boolean b=true,wait=false;
	Timer timer = new Timer();
	private InterviewRepository() {
		
	}
	public static InterviewRepository getInstance() {
		if(interviewRepository==null) {
			interviewRepository=new InterviewRepository();
		}
		return interviewRepository;
	}
	public void addCandidate(Candidate candidate) {
		candidates.add(candidate);
	}
	
	public void startRemove() {
		if (b && !candidates.isEmpty()) {
			b = false;
			if (wait) {
				synchronized (lock) {
		            lock.notifyAll();
		        }
			} else {
				remove();
			}
		} else if (candidates.isEmpty()) {
			wait = true;
			b = true;
		}
	}
	public void remove() {
		MyTimerTask task = new MyTimerTask(lock) {
			public void run() {
				if (!candidates.isEmpty()) {
					candidates.poll();
					
				}else {
					synchronized (lock) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							
						}
					}
				}
				
			}
		};
		timer.schedule(task, 30000, 30000);
	}
	private static class MyTimerTask extends TimerTask {

	    private Object lock;

	    public MyTimerTask(Object lock) {
	        this.lock = lock;
	    }

	    @Override
	    public void run() {
	        System.out.println("inside timer");
	        synchronized (lock) {
	            lock.notifyAll();
	        }
	    }

	}
	public int noOfCandidate() {
		if(candidates.isEmpty()) {
			return 0;
		}
		return candidates.size();
	}
	public String candidateOnInterview() {
		if(candidates.isEmpty())
		return null;
		else {
			return candidates.peek().getName();
		}
	}
	public void stop() {
		timer.cancel();
	}
}
