package com.designpattern.iterator;

public interface ChannelCollection {
	
	public void addChannel(Channel c);
	public void removeChanell(Channel c);
	public ChannelIterator createIterate(String modus);

}
