package com.ab.strategy.dp.component;

public final class  BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart():: 0 Parma constructor");
	}

	public String deliver(int oid) {
		return "Delevering " + oid + " order Id product using BlueDart Service.";
	}

}
