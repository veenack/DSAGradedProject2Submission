package com.gl.department;

public class AdminDepartment extends SuperDepartment {

	private String departmentName = "Admin Department";

	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
}
