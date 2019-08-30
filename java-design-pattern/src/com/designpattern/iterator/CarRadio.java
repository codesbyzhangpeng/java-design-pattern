package com.designpattern.iterator;

import java.util.ArrayList;

public class CarRadio implements ChannelCollection{
	private ArrayList<Channel> channels;
	private String modus;

	public CarRadio() {
		this.channels = new ArrayList<Channel>();
	}
	
	@Override
	public void addChannel(Channel c) {
		channels.add(c);
	}

	@Override
	public void removeChanell(Channel c) {
		channels.remove(c);
	}

	@Override
	public ChannelIterator createIterate(String modus) {
		ChannelIterator iterator;
		if(modus == "shuffle") {
			 iterator = new ChannelIteratorShuffle(channels) ;
		}else {
			iterator =  new ChannelIteratorNormal(channels);
		}
		return iterator;
	}
}
