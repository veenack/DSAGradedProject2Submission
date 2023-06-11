package com.gl.Main;

import com.gl.department.AdminDepartment;
import com.gl.department.HRDepartment;
import com.gl.department.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		HRDepartment hr = new HRDepartment();
		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+ admin.getDepartmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		System.out.println("Welcome to "+ hr.getDepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		
		System.out.println();
		System.out.println("Welcome to "+ tech.getDepartmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
