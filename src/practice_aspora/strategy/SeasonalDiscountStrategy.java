package src.practice_aspora.strategy;

public class SeasonalDiscountStrategy implements DiscountStrategy{
    @Override
    public int discount(int amount) {
        return (int) ((int)amount*0.1);
    }
}
