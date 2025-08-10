package src.practice_aspora.chainOfResponsibility;

public class LevelThreeHandler implements SupportHandler{
    SupportHandler nextHandler;
    @Override
    public void handleNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processRequest(Request request) {
      if(request.getPriority().equals("P0")){
          System.out.println("Handled by L3 Handler, for request : " + request.getPriority());
      } else if (nextHandler != null) {
          nextHandler.processRequest(request);
      }else{
          System.out.println("Request Cannot be handled as Handler Not found, for request : " + request.getPriority());
      }
    }
}
