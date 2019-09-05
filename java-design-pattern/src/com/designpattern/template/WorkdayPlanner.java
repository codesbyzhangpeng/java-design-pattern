package com.designpattern.template;

public abstract class WorkdayPlanner {
	public void createWorkdayPlan() {
		wakeUp();
		takeShower();
		breakfast();
		if(!isHoliday()) {
			goToWork();
			work();
		}
		sleep();
	}
	
	protected boolean isHoliday() {
		return false;
	}

	protected void sleep() {
		System.out.println("Wake up and take a showwer...");
	}

	protected void takeShower() {
		System.out.println("Take a shower...");
	}

	protected void breakfast() {
		System.out.println("Hava breakfast...");
	}

	protected abstract void goToWork();

	protected abstract void work();

	protected  void wakeUp() {
		System.out.println("Go to sleep...");
	}
}
