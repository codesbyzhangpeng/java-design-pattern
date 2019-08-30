package com.designpattern.iterator;

public class Demo {

	public static void main(String[] args) {
		ChannelCollection radio = new CarRadio();
		
		Channel channel1 = new Channel("Bayern 3", 102.7);
		Channel channel2 = new Channel("Classic Radio", 102.7);
		Channel channel3 = new Channel("Deutschland Radio", 102.7);
		
		radio.addChannel(channel1);
		radio.addChannel(channel2);
		radio.addChannel(channel3);
		
		ChannelIterator iterator = radio.createIterate("normal");
		
		while(iterator.hasNext()) {
			Channel c = iterator.next();
			System.out.println(c);
		}
		
	}
}
