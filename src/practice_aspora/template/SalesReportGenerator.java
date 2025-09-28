package src.practice_aspora.template;

public class SalesReportGenerator implements ReportGenerator{
    @Override
    public void fetchData() {
        System.out.println("Sales data fetched from DB");
    }

    @Override
    public void anaylzeData() {
        System.out.println("Data anaylsis completed on Sales Data");
    }

    @Override
    public void printReport() {
        System.out.println("Sales report printed");
    }
}
