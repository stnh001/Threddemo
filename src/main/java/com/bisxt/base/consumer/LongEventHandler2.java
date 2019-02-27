package com.bisxt.base.consumer;


import com.bisxt.base.entity.LongEvent;
import com.lmax.disruptor.EventHandler;

//消费者获取生产推送数据
public class LongEventHandler2 implements EventHandler<LongEvent> {

	@Override
	public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println("消费者2 获取生产者数据..event:" + event.getValue());
	}

}
