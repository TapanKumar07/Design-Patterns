package com.Decorator.Toppings;

import com.Decorator.Pizzas.BasePizza;

public class ExtraCheese extends ToppingGenerator{
    BasePizza b;

    public ExtraCheese(BasePizza b) {
        this.b = b;
    }

    @Override
    public int cost() {
        return b.cost() + 10;
    }
}
