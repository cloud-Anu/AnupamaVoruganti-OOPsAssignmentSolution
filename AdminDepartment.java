package com.gradedassessment.oops;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		 s = "Admin Department ";
		return s;
	}
	public String getTodaysWork() {
		s = "Complete your documents Submission";
		return s;		
	}
	public String getWorkDeadline() {
		s = "Complete by EOD ";
		return s;		
	}
}
