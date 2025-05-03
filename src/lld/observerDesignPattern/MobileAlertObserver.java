package src.lld.observerDesignPattern;

public class MobileAlertObserver implements Observer{
    Observable observable;

    public MobileAlertObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update(int val) {
        System.out.println("Sending Alert via Mobile");
        alertViaMobile(val);
    }

    private void alertViaMobile(int val) {
        System.out.println("Stocks are avaliable now, curr size : " + val);
    }
}
