package com.mydeenAbdul_ZSGS.interviewPanal.noOfCandidate;

import com.mydeenAbdul_ZSGS.interviewPanal.repository.InterviewRepository;

public class NoOfCandidateViewModel {

	private NoOfCandidateView view;
	
	public NoOfCandidateViewModel(NoOfCandidateView view) {
		this.view=view;
	}

	public void noOfCandidate() {
		int n = InterviewRepository.getInstance().noOfCandidate();
		if(n==0) {
			view.fail();
		}else {
			view.success(n-1);
		}
	}
}
