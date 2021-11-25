package com.gradedassessment.oops;


public class Driver {
	public static void main (String args[]) {
		
	//Create references for SuperDepartment & AdminDepartment with same object AdminDepartment	
	SuperDepartment obj1 = new AdminDepartment();	
	System.out.println("Welcome to " + obj1.departmentName());
	System.out.println(obj1.getTodaysWork());
	System.out.println(obj1.getWorkDeadline());
	System.out.println(obj1.isTodayAHoliday());
	System.out.println("");
	
	//Create references for SuperDepartment & HrDepartment with same object HrDepartment
	SuperDepartment obj2 = new HrDepartment();
	HrDepartment obj3 = new HrDepartment();
	System.out.println("Welcome to " + obj2.departmentName());
	System.out.println(obj3.doActivity());
	System.out.println(obj2.getTodaysWork());
	System.out.println(obj2.getWorkDeadline());
	System.out.println(obj2.isTodayAHoliday());
	System.out.println("");
	
	//Create references for SuperDepartment & TechDepartment with same object TechDepartment
	SuperDepartment obj4 = new TechDepartment();
	TechDepartment obj5 = new TechDepartment();
	System.out.println("Welcome to " + obj4.departmentName());
	System.out.println(obj4.getTodaysWork());
	System.out.println(obj4.getWorkDeadline());
	System.out.println(obj5.getTechStackInformation());
	System.out.println(obj4.isTodayAHoliday());
	System.out.println("");
	
	}
}