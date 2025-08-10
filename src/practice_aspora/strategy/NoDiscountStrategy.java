package src.practice_aspora.strategy;

public class NoDiscountStrategy implements DiscountStrategy{
    @Override
    public int discount(int amount) {
        return amount;
    }
}
