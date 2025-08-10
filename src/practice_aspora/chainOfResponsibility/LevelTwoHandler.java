package src.practice_aspora.chainOfResponsibility;

public class LevelTwoHandler implements SupportHandler{
    SupportHandler nextHandler;
    @Override
    public void handleNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processRequest(Request request) {
      if(request.getPriority().equals("P1")){
          System.out.println("Handled by L2 Handler, for request : " + request.getPriority());
      } else if (nextHandler != null) {
          nextHandler.processRequest(request);
      }
    }
}
