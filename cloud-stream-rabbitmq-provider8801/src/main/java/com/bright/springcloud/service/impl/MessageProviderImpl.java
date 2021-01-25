package com.bright.springcloud.service.impl;

import com.bright.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-25 16:00
 */

@EnableBinding(Source.class) //定义消息的推送channel
public class MessageProviderImpl implements IMessageProvider {

	@Resource
	private MessageChannel output;

	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		System.out.println("*****serial: " + serial);
		return serial;
	}
}
