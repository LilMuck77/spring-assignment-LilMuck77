package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesInput;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {

        private Scanner scanner = new Scanner(System.in);




    @Override
    public List<Sale> getSales() {

        for (int i = 0; i < getSales().size() ; i++) {
            System.out.println(getSales());

        }
        return getSales();
    }
}
