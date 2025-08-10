package src.practice_aspora.template;

public abstract class ReportGenerator {

    public void generateReport(){
        fetchData();
        anaylzeData();
        formatData();
        printReport();
    }

    public abstract void fetchData();
    public abstract void anaylzeData();
    public void formatData(){
        System.out.println("Default formatting applied on report!!");
    }
    public abstract void printReport();

}
