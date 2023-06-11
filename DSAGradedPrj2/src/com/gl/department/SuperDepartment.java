package com.gl.department;

public class SuperDepartment {
	
	private String departmentName = "Super Department";

	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getTodaysWork()
	{
		return "No Work as of now";
	}
	
	public String getWorkDeadline(){
		return "Nil";
	}
	
	public String isTodayAHoliday(){
		return "Today is not a Holiday";
	}

}
