package com.sandeep.test.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by smalik3 on 6/18/16
 */
public class FileReadingDemo {

    public static void main(String[] args) throws IOException {
        /*String path = "/Users/smalik3/Downloads/price_ips.list";
        printFileLines(path);
        System.out.println("printing read me file");
        printFileLines("/Users/smalik3/Read me.txt");*/
        System.out.println("Printing a CSV file");
        printFileLines("/Users/smalik3/Downloads/Transactions-Download-06-02-2016.csv");
    }

    public static void printFileLines(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int counter = 0;
        while ((line = bufferedReader.readLine()) != null) {
            counter++;
            System.out.println("Line " + counter + ": " + line);
        }
    }

}
