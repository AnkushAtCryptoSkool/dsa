package src.lld.deccorator;

import src.lld.deccorator.pizza.BasePizza;
import src.lld.deccorator.pizza.FarmHousePizza;
import src.lld.deccorator.toppings.ExtraCheeze;
import src.lld.deccorator.toppings.ExtraSpicy;

public class Cafe {
    public static void main(String[] args) {
        System.out.println("--------Creating Order--------");
        BasePizza farmHouseWithExtraCheezeExtraSpicy = new ExtraSpicy(new ExtraCheeze(new FarmHousePizza()));
        System.out.println("Final Bill Amount --> " + farmHouseWithExtraCheezeExtraSpicy.cost());
    }
}
