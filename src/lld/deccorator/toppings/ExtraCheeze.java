package src.lld.deccorator.toppings;

import src.lld.deccorator.pizza.BasePizza;

public class ExtraCheeze extends Toppings{

    BasePizza basePizza;

    public ExtraCheeze(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
