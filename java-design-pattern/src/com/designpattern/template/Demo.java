package com.designpattern.template;

public class Demo {
	public static void main(String[] args) {
		WorkdayPlanner employee = new EmployeePlan();
		WorkdayPlanner manager = new ManagerPlan();
		
		employee.createWorkdayPlan();
		
		System.out.println();
		
		manager.createWorkdayPlan();
	}

}
