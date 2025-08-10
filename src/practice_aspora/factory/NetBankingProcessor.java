package src.practice_aspora.factory;

public class NetBankingProcessor implements Processor{
    @Override
    public void processTxn() {
        System.out.println("Txn processed by Net Banking !!");
    }
}
