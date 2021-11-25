package com.gradedassessment.oops;

public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		s = "HR Department ";
		return s;
	}
	public String getTodaysWork() {
		s = "Fill today’s timesheet and mark your attendance";
		return s;		
	}
	public String getWorkDeadline() {
		s = "Complete by EOD ";
		return s;		
	}
	public String doActivity() {
		s = "team Lunch";
		return s;		
	}
}