package com.asendar.rabbitmq.core;

/**
 * @author asendar
 *
 */
public interface MessageReceiver {

	void listen(String name) throws Exception;

}
