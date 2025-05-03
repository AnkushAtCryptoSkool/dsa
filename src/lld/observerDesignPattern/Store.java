package src.lld.observerDesignPattern;

public class Store {
    public static void main(String[] args) {
        Observable stockObservable = new StockObervable();
        Observer observer1 = new EmailAlertObserver(stockObservable);
        Observer observer2 = new MobileAlertObserver(stockObservable);
        Observer observer3 = new EmailAlertObserver(stockObservable);
        Observer observer4 = new MobileAlertObserver(stockObservable);
        Observer observer5 = new EmailAlertObserver(stockObservable);
        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.add(observer3);
        stockObservable.add(observer4);
        stockObservable.add(observer5);
        System.out.println("Currently Stock is empty");
        stockObservable.set(0);
        int stocks = 10;
        System.out.println("Filling the stocks with "+stocks);
        stockObservable.set(stocks);
    }
}
