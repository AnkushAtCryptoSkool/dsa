package src.practice_aspora.chainOfResponsibility;

public class LevelOnHandler implements SupportHandler{
    SupportHandler nextHandler;
    @Override
    public void handleNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processRequest(Request request) {
      if(request.getPriority().equals("P2")){
          System.out.println("Handled by L1 Handler, for request : " + request.getPriority());
      } else if (nextHandler != null) {
          nextHandler.processRequest(request);
      }
    }
}
