package com.mydeenAbdul_ZSGS.interviewPanal;

import java.util.Scanner;

import com.mydeenAbdul_ZSGS.interviewPanal.startInterview.StartInterviewView;

public class InterviewPanalApp {

	public static void main(String[] args) {
		InterviewPanalApp app = new InterviewPanalApp();
		app.init();
	}

	private void init() {
		new StartInterviewView().init();
	}

	Scanner s = new Scanner(System.in);

	
}
