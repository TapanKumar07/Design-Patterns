package com.Decorator.Toppings;

import com.Decorator.Pizzas.BasePizza;

public class Mushrooms extends ToppingGenerator{
        BasePizza b;

        public Mushrooms(BasePizza b) {
                this.b = b;
        }

        @Override
        public int cost() {
                return b.cost() + 15;
        }
}
