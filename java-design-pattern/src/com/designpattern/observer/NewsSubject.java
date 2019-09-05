package com.designpattern.observer;

import java.util.ArrayList;

public abstract class NewsSubject {
	protected ArrayList<NewsObserver> observers = new ArrayList<NewsObserver>();
	
	public void subcribe(NewsObserver observer) {
		if(!observers.contains(observer)) {
			this.observers.add(observer);
		}
	}
	
	public void unsubscribe(NewsObserver observer) {
		if(observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}
	
	public void  pushNews(Newsletter newsletter) {
		for(NewsObserver o: observers) {
			o.update(newsletter);
		}
	}
}
