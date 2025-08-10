package src.practice_aspora.strategy;

public class VIPDiscountStrategy implements DiscountStrategy{
    @Override
    public int discount(int amount) {
        return (int) ((int)amount*0.2);
    }
}
