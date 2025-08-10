package src.practice_aspora.strategy;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public int finalAmount(int amount){
        return amount - discountStrategy.discount(amount);
    }
}
