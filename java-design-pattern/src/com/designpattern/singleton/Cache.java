package com.designpattern.singleton;

public class Cache {

	private static volatile Cache cache;
	private Cache() {}
	public static Cache getInstance() {
		if(cache==null) {
			synchronized(Cache.class) {
				if(cache==null) {
					Cache cache = new Cache();
				}
			}
		}
			return cache;
	}
}
