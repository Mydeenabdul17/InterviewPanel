package com.mydeenAbdul_ZSGS.interviewPanal.candidateOnInterview;

public class CandidateOnInterviewView {

	private CandidateOnInterviewViewModel model;
	
	public CandidateOnInterviewView() {
		model=new CandidateOnInterviewViewModel(this);
	}
	
	public void candidateOnInterview() {
		model.candidateOnInterview();
	}

	public void fail() {
		System.out.println("No one is in interview");
	}

	public void success(String name) {
		System.out.println("the candidate is in interview -> "+name);
	}
}
