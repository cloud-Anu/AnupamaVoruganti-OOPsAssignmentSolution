package com.gradedassessment.oops;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		s = "Tech Department ";
		return s;
	}
	public String getTodaysWork() {
		s = "Complete coding of module 1";
		return s;		
	}
	public String getWorkDeadline() {
		s = "Complete by EOD ";
		return s;		
	}
	public String getTechStackInformation() {
		s = "core Java";
		return s;		
	}
}
