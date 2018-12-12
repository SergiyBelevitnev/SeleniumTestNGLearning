package utils;

import au.com.bytecode.opencsv.CSVReader;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ReadCsv {

    @Test


    public void readCsv() throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader(csvFile));
//
//            // use comma as separator
//            String[] cols = line.split(cvsSplitBy);
//            System.out.println("Coulmn 4= " + cols[4] + " , Column 5=" + cols[5]);
//        }
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',', '"', 1);

//        List<String[]> allRows = reader.readAll();
//        //Read CSV line by line and use the string array as you want
//        for(String[] row : allRows){
//            System.out.println(Arrays.toString(row));
        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));

            }
        }
    }
}
