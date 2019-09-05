package com.designpattern.observer;

public class Demo {
	public static void main(String[] args) {
		Newsletter news1 = new Newsletter("football news in UK", "the content of the news");
		NewsSubject footballNews = new SportNews(news1);
		
		NewsObserver sub1 = new NewsSubscriber("James Smith");
		NewsObserver sub2 = new NewsSubscriber("Tom Tylor");
		NewsObserver sub3 = new NewsSubscriber("Maria Hofmann");
		NewsObserver sub4 = new NewsSubscriber("Johannes Bach");
		
		footballNews.subcribe(sub1);
		footballNews.subcribe(sub2);
		footballNews.subcribe(sub3);
		footballNews.subcribe(sub4);
		
		footballNews.unsubscribe(sub4);
		
		footballNews.pushNews(news1);


	}

}
