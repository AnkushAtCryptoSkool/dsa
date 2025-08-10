package src.practice_aspora.factory;

public class NEFTProcessor implements Processor{
    @Override
    public void processTxn() {
        System.out.println("Txn processed by NEFT !!");
    }
}
