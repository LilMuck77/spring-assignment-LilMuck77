package edu.wctc.springassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput {

    private List<String> readFile(String fileName){
        List<String> allSales = new ArrayList<String>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) !=null){
                allSales.add(line);
            }
            reader.close();
            return allSales;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
