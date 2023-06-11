package com.gl.department;

public class HRDepartment extends SuperDepartment {
	private String departmentName = "HR Department";

	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getTodaysWork()
	{
		return "Fill Today's Timesheet and mark your attendance";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String doActivity(){
		return "Team Lunch";
	}
}
