package com.designpattern.template;

public class EmployeePlan extends WorkdayPlanner{

	@Override
	protected void goToWork() {
		System.out.println("go to work by car...");
	}

	@Override
	protected void work() {
		System.out.println("work on the project...");
	}

}
