package com.baikati.pattern;

import com.baikati.Pizza;

public class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		pizza = PizzaFactory.cratePizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		return pizza;
	}
}
