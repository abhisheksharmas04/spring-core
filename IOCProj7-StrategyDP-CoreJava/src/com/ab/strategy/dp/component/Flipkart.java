package com.ab.strategy.dp.component;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart():: Zero Param constructor");
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier():: method invoke");
		this.courier = courier;
	}

	public String shopping(String[] items, float[] prices) {
		float billAmounth = 0.0f;
		for (float p : prices) {
			billAmounth += p;
		}
		// Generate Order Id
		int oid = new Random().nextInt(1000);

		// use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " " + "with prices " + Arrays.toString(prices) + " having bill Amounth "
				+ billAmounth + " " + msg;
	}

}
