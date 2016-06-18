package com.sandeep.test.files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by smalik3 on 6/18/16
 */
public class FileWritingDemo {

    public static void main(String[] args) throws IOException {

        /*
        \n = new line character
        \t = tab character
         */

        FileWriter fileWriter = new FileWriter("/Users/smalik3/newFile.txt");
        fileWriter.write("This is line 1\n\n\n\n");
        fileWriter.write("This is line 2" + "\n");
        fileWriter.write("\tThis is line 3");
        fileWriter.write('\n');
        fileWriter.write("\t\tThis is line 4\n");
        fileWriter.close();

        fileWriter = new FileWriter("/Users/smalik3/newFile.txt");
        fileWriter.write("This is line 5\n");
        fileWriter.close();

    }
}
