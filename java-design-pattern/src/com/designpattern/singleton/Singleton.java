package com.designpattern.singleton;
// 
public class Singleton {
	/* A singleton class allows only one instance to be created
	 * Two components: 
	 * 1. a private constructor that prevents the class being instantiated from outside;
	 * 2. a public static method returns the only object of the class
	 * 
	 * Three ways to create the instance:
	 * 1. lazy SingleTon implementation: append the synchronized keyword to the getter method
	 * 	  and check if the instance is existed, if not, create the Instance,
	 * 	  return the instance in the end
	 * 2. declare a public and constant(final and static) singleton instance 
	 *    and instantiate the singleton class
	 * 3. create an inner class and 
	 * 	  then declare a public and constant(final and static) singleton instance 
	 *    and instantiate the singleton class
	 *    create a static get method to return the instance.
	 * */
	
	
/*Lazy Singleton implementation	*/
 
 	private static Singleton INSTANCE;
	private Singleton() {}
	public synchronized static Singleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Singleton();	
		}
		return INSTANCE;
	}	

	
	
	/*
	 * a new approach of singleton implementation
	  //the access modifier of the INSTANCE is not that important and can be removed!!!
	public static final Singleton INSTANCE = new Singleton();
	private Singleton() {}
	public static SingleTon getInstance(){return INSTANCE;}
	
	*/
	
	
	
		
}
