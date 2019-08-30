package com.designpattern.iterator;

import java.util.ArrayList;

public class ChannelIteratorNormal implements ChannelIterator{
	
	private ArrayList<Channel> channels;
	private int currentPosition;
	
	public ChannelIteratorNormal(ArrayList<Channel> channels) {
		this.channels = channels;
	}

	@Override
	public boolean hasNext() {
		if(currentPosition < channels.size()) {
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Channel next() {
		return channels.get(currentPosition++);
	}
}
