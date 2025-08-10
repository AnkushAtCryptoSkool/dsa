package src.practice_aspora.observer;

public class SMSConsumer implements Consumer{
    @Override
    public void receiveInfo(String info) {
        System.out.println("Information received via SMS : " + info);
    }
}
