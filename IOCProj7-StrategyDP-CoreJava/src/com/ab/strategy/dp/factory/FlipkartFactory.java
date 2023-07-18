package com.ab.strategy.dp.factory;

import com.ab.strategy.dp.component.BlueDart;
import com.ab.strategy.dp.component.Courier;
import com.ab.strategy.dp.component.DTDC;
import com.ab.strategy.dp.component.Flipkart;

public class FlipkartFactory {
	
	// static factory method having factory pattern
	public static Flipkart getInstance(String courierType) {
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("DTDC")) {
			courier = new DTDC();
		}else if(courierType.equalsIgnoreCase("Bdart")) {
			courier = new BlueDart();
		}else {
			throw new IllegalArgumentException("Invlaid courier type");
		}
		
		// crate target class object.
		Flipkart flipkart = new Flipkart();
		
		// assing dependet class object to target class object
		flipkart.setCourier(courier);
		
		return flipkart;
	}

}
