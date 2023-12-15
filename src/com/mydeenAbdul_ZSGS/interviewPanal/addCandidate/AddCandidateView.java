package com.mydeenAbdul_ZSGS.interviewPanal.addCandidate;

import java.util.Scanner;

import com.mydeenAbdul_ZSGS.interviewPanal.dto.Candidate;

public class AddCandidateView {

	private AddCandidateViewModel addCandidateViewModel;
	Scanner s=new Scanner(System.in);
	int sn=1;
	public AddCandidateView() {
		addCandidateViewModel=new AddCandidateViewModel(this);
	}
	
	public void addCandidate() {
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Enter your age");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("Enter your Qualification");
		String qualification = s.next();
		System.out.println("Enter your year of Experience");
		int experience = s.nextInt();
		s.nextLine();
		System.out.println("Enter the role you applied for");
		String role = s.next();
		
		addCandidateViewModel.addCandidate(new Candidate(sn++, name, age, qualification, experience, role));
	}

	public void added() {
		System.out.println("Register Successfull");
	}
	
	public void remove() {
		addCandidateViewModel.remove();
	}

	public void stop() {
		addCandidateViewModel.stop();
	}
}
