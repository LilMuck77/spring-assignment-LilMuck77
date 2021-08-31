package edu.wctc.springassignment.impl;

import edu.wctc.springassignment.Sale;
import edu.wctc.springassignment.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileInput {

    List<Sale> getSales = FileInput.readFile("salesCustomers.txt");

    public FileInput() throws FileNotFoundException {
    }


    public static List<Sale> readFile(String fileName) throws FileNotFoundException {

        File fileNames = new File(fileName);
        if (fileNames.canRead()) {
            Scanner scanner = new Scanner(fileNames);

            while (scanner.hasNext()) {
                String sale = scanner.next();

                readFile(sale);
                {

                }
            }

        }
        return null;

    }

}








