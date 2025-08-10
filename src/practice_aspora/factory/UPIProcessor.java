package src.practice_aspora.factory;

public class UPIProcessor implements Processor{
    @Override
    public void processTxn() {
        System.out.println("Txn processed by UPI !!");
    }
}
