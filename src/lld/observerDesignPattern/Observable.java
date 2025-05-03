package src.lld.observerDesignPattern;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void set(int val);

    public void notifyAllSubscribers(int val);

}
