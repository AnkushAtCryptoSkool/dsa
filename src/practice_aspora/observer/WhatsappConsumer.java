package src.practice_aspora.observer;

public class WhatsappConsumer implements Consumer{
    @Override
    public void receiveInfo(String info) {
        System.out.println("Information received via Whatsapp : " + info);
    }
}
