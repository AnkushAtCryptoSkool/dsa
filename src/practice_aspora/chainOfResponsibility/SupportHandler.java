package src.practice_aspora.chainOfResponsibility;

public interface SupportHandler {
    public void handleNext(SupportHandler handler);

    public void processRequest(Request request);
}
