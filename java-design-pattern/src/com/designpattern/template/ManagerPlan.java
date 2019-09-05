package com.designpattern.template;

public class ManagerPlan extends WorkdayPlanner{

	@Override
	protected void goToWork() {
		System.out.println("go to work by bike...");
	}

	@Override
	protected void work() {
		System.out.println("check monthly and weekly report...");		
	}
	
	@Override
	protected boolean isHoliday() {
		return true;
	}

}
