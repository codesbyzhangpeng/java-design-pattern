package com.designpattern.singleton;

// Singleton Initialization-On-Demand Holder Idiom
public class SingleInnerClass {

	private SingleInnerClass() {}
	
	private static class SingletonHolder{
		private static final SingleInnerClass INSTANCE = new SingleInnerClass();
		}
	
	public static SingleInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
