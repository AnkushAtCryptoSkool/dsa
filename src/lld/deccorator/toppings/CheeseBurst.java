package src.lld.deccorator.toppings;

import src.lld.deccorator.pizza.BasePizza;

public class CheeseBurst extends Toppings{

    BasePizza basePizza;

    public CheeseBurst(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
