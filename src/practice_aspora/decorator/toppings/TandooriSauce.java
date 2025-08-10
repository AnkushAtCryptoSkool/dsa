package src.practice_aspora.decorator.toppings;

import src.practice_aspora.decorator.bases.BasePizza1;

public class TandooriSauce extends Toppings{
    BasePizza1 basePizza;
    public TandooriSauce(BasePizza1 basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
         return basePizza.cost() + 10;
    }
}
