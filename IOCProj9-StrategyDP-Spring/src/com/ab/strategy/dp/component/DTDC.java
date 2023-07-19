package com.ab.strategy.dp.component;

public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC.DTDC():: 0 Parma constructor");
	}

	public String deliver(int oid) {
		return "Delevering " + oid + " order Id product using DTDC Service.";
	}

}
