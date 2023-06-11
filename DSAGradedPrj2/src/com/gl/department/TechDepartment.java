package com.gl.department;

public class TechDepartment extends SuperDepartment{

	private String departmentName = "Tech Department";

	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String getTechStackInformation(){
		return "Core Java";
	}
}
