package com.Decorator;

import com.Decorator.Pizzas.BasePizza;
import com.Decorator.Pizzas.Margereta;
import com.Decorator.Toppings.ExtraCheese;
import com.Decorator.Toppings.Mushrooms;

public class decorator {
    public static void main(String[] args) {
        BasePizza p =  new Mushrooms(new ExtraCheese(new Margereta()));
        System.out.println(p.cost());
    }
}
