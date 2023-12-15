package com.mydeenAbdul_ZSGS.interviewPanal.noOfCandidate;

public class NoOfCandidateView {

	private NoOfCandidateViewModel model;
	
	public NoOfCandidateView() {
		model=new NoOfCandidateViewModel(this);
	}
	
	public void noOfCandidate() {
		model.noOfCandidate();
	}

	public void fail() {
		System.out.println("No candidate is in Queue");
	}

	public void success(int n) {
		System.out.println("No of Candidates in Queue -> "+n);
	}
}
