package src.practice_aspora;

import src.practice_aspora.factory.PaymentType;
import src.practice_aspora.factory.Processor;
import src.practice_aspora.factory.Txn;
import src.practice_aspora.factory.TxnProcessor;

public class MainClass {
    public static void main(String[] args) {
//        SingletonInstance s1 = SingletonInstance.getInstance();
//        SingletonInstance s2 = SingletonInstance.getInstance();
//        if(s1 == s2){
//            System.out.println("Singlton works " + s1 + " == " + s2);
//        }

        // factory practice
        Txn t1 = new Txn(1, PaymentType.NEFT,200);
        Txn t2 = new Txn(2, PaymentType.UPI,300);
        Txn t3 = new Txn(3, PaymentType.NetBanking,400);
        TxnProcessor txnProcessor = new TxnProcessor();
        Processor t1Processor = txnProcessor.getProcosser(t1.getType());
        Processor t2Processor = txnProcessor.getProcosser(t2.getType());
        Processor t3Processor = txnProcessor.getProcosser(t3.getType());
        t1Processor.processTxn();
        t2Processor.processTxn();
        t3Processor.processTxn();
    }
}
