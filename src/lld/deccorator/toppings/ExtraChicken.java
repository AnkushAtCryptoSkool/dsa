package src.lld.deccorator.toppings;

import src.lld.deccorator.pizza.BasePizza;

public class ExtraChicken extends Toppings{

    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }
}
