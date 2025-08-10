package src.practice_aspora.factory;

public class RefundProcessor implements Processor{
    @Override
    public void processTxn() {
        System.out.println("Txn processed - Type Refund !!");
    }
}
