package com.bright.spirngcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-25 16:42
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

	@Value("${server.port}")
	private String serverPort;

	@StreamListener(Sink.INPUT)
	public void input(Message<String> message) {
		System.out.println("消费者1号,------>接受到的消息：" + message.getPayload() + "\t ,serverPort: " + serverPort);
	}
}
