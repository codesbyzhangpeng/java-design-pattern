package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class ChannelIteratorShuffle implements ChannelIterator{
	
	private ArrayList<Channel> channels;
	private ArrayList<Channel> channelsShuffled;
	private int currentPosition;
	
	public ChannelIteratorShuffle(ArrayList<Channel> channels) {
		this.channels = channels;
		shuffle();
	}

	private void shuffle() {
		channelsShuffled = new ArrayList<Channel>(channels);
		Collections.shuffle(channelsShuffled);
	}

	@Override
	public boolean hasNext() {
		if(channelsShuffled.size() > currentPosition) {
		return true;
		}else {
			return false;
		}
	
	}

	@Override
	public Channel next() {
		return channelsShuffled.get(currentPosition++);	
	}
}
