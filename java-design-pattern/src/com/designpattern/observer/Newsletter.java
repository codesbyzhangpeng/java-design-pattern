package com.designpattern.observer;

public class Newsletter {
	private String topic;
	private String content;
	
	public Newsletter(String topic, String content) {
		super();
		this.topic = topic;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Newsletter [topic=" + topic + ", content=" + content + "]";
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
