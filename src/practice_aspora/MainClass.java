package src.practice_aspora;

import src.lld.observerDesignPattern.Observer;
import src.practice_aspora.builder.Computer;
import src.practice_aspora.decorator.bases.BasePizza1;
import src.practice_aspora.decorator.bases.ChickenSpecial;
import src.practice_aspora.decorator.bases.VegDelight;
import src.practice_aspora.decorator.toppings.ExtraCheese;
import src.practice_aspora.factory.PaymentType;
import src.practice_aspora.factory.Processor;
import src.practice_aspora.factory.Txn;
import src.practice_aspora.factory.TxnProcessor;
import src.practice_aspora.observer.Consumer;
import src.practice_aspora.observer.PaymentNotifier;
import src.practice_aspora.observer.SMSConsumer;
import src.practice_aspora.observer.WhatsappConsumer;
import src.practice_aspora.strategy.ShoppingCart;
import src.practice_aspora.strategy.VIPDiscountStrategy;

public class MainClass {
    public static void main(String[] args) {
//        SingletonInstance s1 = SingletonInstance.getInstance();
//        SingletonInstance s2 = SingletonInstance.getInstance();
//        if(s1 == s2){
//            System.out.println("Singlton works " + s1 + " == " + s2);
//        }

        // factory practice
//        Txn t1 = new Txn(1, PaymentType.NEFT,200);
//        Txn t2 = new Txn(2, PaymentType.UPI,300);
//        Txn t3 = new Txn(3, PaymentType.NetBanking,400);
//        TxnProcessor txnProcessor = new TxnProcessor();
//        Processor t1Processor = txnProcessor.getProcosser(t1.getType());
//        Processor t2Processor = txnProcessor.getProcosser(t2.getType());
//        Processor t3Processor = txnProcessor.getProcosser(t3.getType());
//        t1Processor.processTxn();
//        t2Processor.processTxn();
//        t3Processor.processTxn();


        // builder Pattern
//        Computer computer = new Computer.builder()
//                .cpu("Intel A4")
//                .ram("16 GB")
//                .storage("1 TB").build();
//        System.out.println(computer.toString());

 //   Observer Design Pattern
//        Consumer whatsappConsumer = new WhatsappConsumer();
//        Consumer smsConsumer = new SMSConsumer();
//
//        PaymentNotifier notifier = new PaymentNotifier();
//        notifier.registerConsumers(whatsappConsumer);
//        notifier.registerConsumers(smsConsumer);
//        notifier.updateInfo("Rs 201 received at Phone Pe");

        // Decorater Pattern
//        BasePizza1 extraCheeseVegDelight = new ExtraCheese(new ChickenSpecial());
//        System.out.println(extraCheeseVegDelight.cost());

        // Strategy Design Pattern
        ShoppingCart shoppingCart = new ShoppingCart(new VIPDiscountStrategy());
        System.out.println("Shopping cart final value for VIP customers after discount : " + shoppingCart.finalAmount(1000));

    }

}
