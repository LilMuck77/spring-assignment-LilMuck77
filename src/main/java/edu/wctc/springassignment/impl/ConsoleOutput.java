package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesReport;

import java.util.List;

public class ConsoleOutput implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println(salesList);
    }
}
