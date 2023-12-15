package com.mydeenAbdul_ZSGS.interviewPanal.dto;

public class Candidate {
	private int sno;
	private String name;
	private int age;
	private String qualification;
	private int experience;
	private String role;
	
	public Candidate() {
		
	}
	public Candidate(int sno, String name, int age, String qualification, int experience, String role) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.experience = experience;
		this.role = role;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Candidate [sno=" + sno + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", experience=" + experience + ", role=" + role + "]";
	}
}
