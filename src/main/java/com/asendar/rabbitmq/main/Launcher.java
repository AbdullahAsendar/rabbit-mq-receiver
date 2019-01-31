package com.asendar.rabbitmq.main;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.asendar.rabbitmq.core.ExchangeMessageReceiver;

/**
 * @author asendar
 *
 */
public class Launcher {

	public static void main(String[] args) {
		try {
			new ExchangeMessageReceiver().listen("test-queue");
		} catch (IOException | TimeoutException e) {
			e.printStackTrace();
		}

	}

}
