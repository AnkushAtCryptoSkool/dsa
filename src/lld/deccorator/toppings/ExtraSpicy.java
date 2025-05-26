package src.lld.deccorator.toppings;

import src.lld.deccorator.pizza.BasePizza;

public class ExtraSpicy extends Toppings{

    BasePizza basePizza;

    public ExtraSpicy(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
