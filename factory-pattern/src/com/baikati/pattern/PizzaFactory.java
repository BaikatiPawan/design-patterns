package com.baikati.pattern;

import com.baikati.CheesePizza;
import com.baikati.ChickenPizza;
import com.baikati.CornPizza;
import com.baikati.Pizza;

public class PizzaFactory {
	public static Pizza cratePizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("chicken")) {
			pizza = new ChickenPizza();
		} else if (type.equals("corn")) {
			pizza = new CornPizza();
		}

		return pizza;
	}
}
