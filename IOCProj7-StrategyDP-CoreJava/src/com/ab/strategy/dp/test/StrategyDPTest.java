package com.ab.strategy.dp.test;

import com.ab.strategy.dp.component.Flipkart;
import com.ab.strategy.dp.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		// get target class object
		Flipkart flipkart = FlipkartFactory.getInstance("DTDC");
		
		String result = flipkart.shopping(new String[] { "Shirt", "Trouser", "Jeans", "Shoes" },
                new float[] { 4000.00f, 6000.00f, 3000.00f, 8000.00f });
		
		System.out.println(result);
	}
}
