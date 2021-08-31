package edu.wctc.springassignment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext();
        springContext.register(AppConfig.class);
        springContext.refresh();

        ReportGenerator report = (ReportGenerator)springContext.getBean("reportGenerator");
        report.generateSales();
    }
}
