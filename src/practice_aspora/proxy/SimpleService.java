package src.practice_aspora.proxy;

public class SimpleService implements BaseService {

  @Override
  public void execute() {
    System.out.println("Main Business Logic Executed");
  }
}
