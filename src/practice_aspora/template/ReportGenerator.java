package src.practice_aspora.template;

public interface ReportGenerator {

    public default void generateReport(){
        fetchData();
        anaylzeData();
        formatData();
        printReport();
    }

    public abstract void fetchData();
    public abstract void anaylzeData();
     default void formatData(){
        System.out.println("Default formatting applied on report!!");
    }
    public abstract void printReport();

}
