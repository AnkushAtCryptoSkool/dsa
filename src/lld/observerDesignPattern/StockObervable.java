package src.lld.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StockObervable implements Observable{

    List<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
       list.remove(observer);
    }

    @Override
    public void set(int val) {
       if(val > 0)
           notifyAllSubscribers(val);
    }

    @Override
    public void notifyAllSubscribers(int val) {
       list.stream().forEach(observer -> observer.update(val));
    }
}
