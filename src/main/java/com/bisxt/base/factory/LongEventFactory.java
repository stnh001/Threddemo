package com.bisxt.base.factory;


import com.bisxt.base.entity.LongEvent;
import com.lmax.disruptor.EventFactory;

// EventFactory 实例化LongEvent
public class LongEventFactory implements EventFactory<LongEvent> {

	@Override
	public LongEvent newInstance() {

		return new LongEvent();
	}

}
