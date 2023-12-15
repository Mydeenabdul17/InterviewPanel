package com.mydeenAbdul_ZSGS.interviewPanal.startInterview;

import java.util.Scanner;

import com.mydeenAbdul_ZSGS.interviewPanal.addCandidate.AddCandidateView;
import com.mydeenAbdul_ZSGS.interviewPanal.candidateOnInterview.CandidateOnInterviewView;
import com.mydeenAbdul_ZSGS.interviewPanal.noOfCandidate.NoOfCandidateView;

public class StartInterviewView {

	Scanner s=new Scanner(System.in);
	public void init() {
		AddCandidateView addCandidateView = new AddCandidateView();
		NoOfCandidateView noOfCandidateView = new NoOfCandidateView();
		CandidateOnInterviewView candidateOnInterviewView=new CandidateOnInterviewView();
		System.out.println("Welcome to Interview");
		start: do {
			System.out.println("Choose th option");
			System.out.println("1.Add candidate\n2.no of candidates\n3.candidate on interview\n4.end Interview");
			int choice = s.nextInt();
			s.nextLine();
			switch (choice) {
			case 1: {
				addCandidateView.addCandidate();
				break;
			}
			case 2: {
				noOfCandidateView.noOfCandidate();
				break;
			}
			case 3: {
				candidateOnInterviewView.candidateOnInterview();
				break;
			}
			case 4: {
				addCandidateView.stop();
				break start;
			}
			default: {
				System.out.println("Choose valid choice");
			}
			}
			addCandidateView.remove();
		} while (true);
		System.out.println("Thank you for attending interview");
	}
}
