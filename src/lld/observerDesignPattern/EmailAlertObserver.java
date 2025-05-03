package src.lld.observerDesignPattern;

public class EmailAlertObserver implements Observer{
    Observable observable;

    public EmailAlertObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update(int val) {
        System.out.println("Sending Alert via Email");
        alertViaEmail(val);
    }

    private void alertViaEmail(int val) {
        System.out.println("Stocks are avaliable now, curr size : " + val);
    }
}
