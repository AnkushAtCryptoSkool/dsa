package src.practice_aspora;

import src.lld.observerDesignPattern.Observer;
import src.practice_aspora.Adapter.MainPaymentProcessor;
import src.practice_aspora.Adapter.PayementAdapter;
import src.practice_aspora.Adapter.ThirdPartyLegacyPayementGateway;
import src.practice_aspora.builder.Computer;
import src.practice_aspora.chainOfResponsibility.*;
import src.practice_aspora.command.*;
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
import src.practice_aspora.proxy.ProxyService;
import src.practice_aspora.strategy.ShoppingCart;
import src.practice_aspora.strategy.VIPDiscountStrategy;
import src.practice_aspora.template.ReportGenerator;
import src.practice_aspora.template.SalesReportGenerator;

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
//        ShoppingCart shoppingCart = new ShoppingCart(new VIPDiscountStrategy());
//        System.out.println("Shopping cart final value for VIP customers after discount : " + shoppingCart.finalAmount(1000));

        // Proxy Service code
        //. It acts as an intermediary that wraps the real object
        // and can add additional behavior before or after forwarding requests to the actual object.
//        ProxyService proxyService = new ProxyService();
//        proxyService.execute();

        // Command DESIGN PATTERN
//        Light light = new Light();
//        Command lightOnCommand = new LightOnCommand(light);
//        Command lightOffCommand = new LightOffCommand(light);
//        RemoteControl remoteControl = new RemoteControl();
//        remoteControl.setCommand(lightOnCommand);
//        remoteControl.pressButton();
//        remoteControl.setCommand(lightOffCommand);
//        remoteControl.pressButton();

        // Template Design Pattern
//        ReportGenerator salesReportGenerator = new SalesReportGenerator();
//         salesReportGenerator.generateReport();

        // Chain of Responsibility
//        Request r1 = new Request("P2");
//        Request r2 = new Request("P1");
//        Request r3 = new Request("P0");
//        Request r4 = new Request("P3");
//        SupportHandler l1 = new LevelOnHandler();
//        SupportHandler l2 = new LevelTwoHandler();
//        SupportHandler l3 = new LevelThreeHandler();
//        l1.handleNext(l2);
//        l2.handleNext(l3);
//
//        l1.processRequest(r1);
//        l1.processRequest(r2);
//        l1.processRequest(r3);
//        l1.processRequest(r4);

        // Adapter Design Pattern
//        MainPaymentProcessor processor = new PayementAdapter(new ThirdPartyLegacyPayementGateway());
//        processor.pay(20000.0);
    }

}
