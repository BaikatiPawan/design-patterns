package com.baikati;

public class CornPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing Corn Pizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking Corn Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Corn Pizza");
	}

}
