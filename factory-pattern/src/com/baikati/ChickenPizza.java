package com.baikati;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing Chichken Pizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking Chichken Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Chichken Pizza");
	}

}
