package com.mydeenAbdul_ZSGS.interviewPanal.candidateOnInterview;

import com.mydeenAbdul_ZSGS.interviewPanal.repository.InterviewRepository;

public class CandidateOnInterviewViewModel {

	private CandidateOnInterviewView view;
	
	public CandidateOnInterviewViewModel(CandidateOnInterviewView view) {
		this.view=view;
	}

	public void candidateOnInterview() {
		String name=InterviewRepository.getInstance().candidateOnInterview();
		if(name==null) {
			view.fail();
		}else {
			view.success(name);
		}
	}
}
