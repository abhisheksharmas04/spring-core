package com.ab.strategy.dp.component;

public final class  FedEx implements Courier {

	public FedEx() {
		System.out.println("FedEx.FedEx()::0 Parma constructor");
	}

	public String deliver(int oid) {
		return "Delevering " + oid + " order Id product using FedEx Service.";
	}

}
