package src.practice_aspora.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentNotifier implements Producer{
    private List<Consumer> consumerList = new ArrayList<>();
    String info;
    @Override
    public void registerConsumers(Consumer consumer) {
        consumerList.add(consumer);
    }

    @Override
    public void removeConsumers(Consumer consumer) {
        consumerList.remove(consumer);
    }

    @Override
    public void notifyConsumers(List<Consumer> consumerList) {
        consumerList.forEach(consumer -> consumer.receiveInfo(info));
    }

    @Override
    public void updateInfo(String info) {
      this.info = info;
      notifyConsumers(consumerList);
    }
}
