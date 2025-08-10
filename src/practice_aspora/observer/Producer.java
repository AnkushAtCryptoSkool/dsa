package src.practice_aspora.observer;

import java.util.List;

public interface Producer {
    void registerConsumers(Consumer consumer);
    void removeConsumers(Consumer consumer);

    void notifyConsumers(List<Consumer> consumerList);

    void updateInfo(String info);
}
