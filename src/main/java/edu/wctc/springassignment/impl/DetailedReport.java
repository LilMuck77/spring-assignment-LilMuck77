package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesReport;

import java.util.List;

public class DetailedReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.println("Customer     Country     Amount    Tax  Shipping");
        System.out.println(salesList);
    }
}
