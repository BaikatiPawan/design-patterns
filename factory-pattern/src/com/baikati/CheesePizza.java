package com.baikati;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing Cheese Pizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking Cheese Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Cheese Pizza");
	}

	
}
