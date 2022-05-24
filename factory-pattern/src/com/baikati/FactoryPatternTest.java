package com.baikati;

import com.baikati.pattern.PizzaStore;

public class FactoryPatternTest {
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("corn");
		
	}
}
