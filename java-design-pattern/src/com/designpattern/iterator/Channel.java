package com.designpattern.iterator;

public class Channel {
	private String name;
	private double frequency;

	public Channel(String name, double frequency) {
		this.name = name;
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Channel: [name=" + name + ", frequency=" + frequency + "]";
	}

}
