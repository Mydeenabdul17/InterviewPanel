package com.mydeenAbdul_ZSGS.interviewPanal.addCandidate;

import com.mydeenAbdul_ZSGS.interviewPanal.dto.Candidate;
import com.mydeenAbdul_ZSGS.interviewPanal.repository.InterviewRepository;

public class AddCandidateViewModel {

	private AddCandidateView addCandidateView;
	public AddCandidateViewModel(AddCandidateView addCandidateView) {
		this.addCandidateView=addCandidateView;
	}
	public void addCandidate(Candidate candidate) {
		InterviewRepository.getInstance().addCandidate(candidate);
		addCandidateView.added();
	}
	public void remove() {
		InterviewRepository.getInstance().startRemove();
	}
	public void stop() {
		InterviewRepository.getInstance().stop();
	}
}
