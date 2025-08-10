package src.practice_aspora.proxy;

public class ProxyService implements BaseService{

    private BaseService simpleService;
    @Override
    public void execute() {
        if(simpleService == null){
            simpleService = new SimpleService();
        }
        System.out.println("--------------- Before executing main business logic Logging ---------------");
        simpleService.execute();
        System.out.println("--------------- After executing main business logic Logging ---------------");

    }
}
