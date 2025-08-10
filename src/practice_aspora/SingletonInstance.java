package src.practice_aspora;

public class SingletonInstance {
    private static volatile SingletonInstance singletonInstance;

    private SingletonInstance(){

    }

    public synchronized static SingletonInstance getInstance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonInstance();
        }
        return singletonInstance;
    }

}
