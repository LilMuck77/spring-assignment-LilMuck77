package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesInput;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {

        private Scanner scanner = new Scanner(System.in);




    @Override
    public List<Sale> getSales() {
        String customerName = "";
        String country = "";
        double saleAmount = 0;



        System.out.println("Enter Customer Name:");
        System.out.println(customerName);
        scanner.nextLine();
        System.out.println("Enter Country:");
        System.out.println(country);
        scanner.nextLine();
        System.out.println("Enter Sale Amount:");
        System.out.println(saleAmount);
        scanner.nextLine();


        

        return getSales();
    }


}
