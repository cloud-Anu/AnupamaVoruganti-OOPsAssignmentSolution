package com.gradedassessment.oops;

//Superclass
public class SuperDepartment {
	
	public String s;
	
	public String departmentName() {
		s = "Super Department";
		return s;
	}
	public String getTodaysWork() {
		s = "No Work as of now";
		return s;		
	}
	public String getWorkDeadline() {
		s = "Nil";
		return s;
		//System.out.println("Super Department");
	}
	public String isTodayAHoliday() {
		s = "Today is not a holiday";
		return s;		
	}
}
