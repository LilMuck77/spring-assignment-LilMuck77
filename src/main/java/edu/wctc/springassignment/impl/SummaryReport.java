package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesReport;

import java.util.List;

public class SummaryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Summary of Sales:");
        System.out.println(salesList);

    }
}
