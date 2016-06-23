package com.sandeep.test.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by smalik3 on 6/22/16
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int answer = divide(10, 2);
            System.out.println("10/2 = " + answer);

            int ans = divide2(19, 0);
            System.out.println("ans is " + ans);

            final int answer2 = divide(19, 0);
            System.out.println("answer2 is " + answer2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int divide(int n1, int n2) {
        try {
            int result = n1/n2;
            System.out.println("result is: " + result);
            return result;
        } catch (Exception e) {
            System.out.println("error in dividing");
            e.printStackTrace();
            throw new RuntimeException(e); // this is exception chaining
        }
    }

    private static int divide2(int n1, int n2) {
        try {
            int result = n1/n2;
            System.out.println("result is: " + result);
            return result;
        } catch (Exception e) {
            System.out.println("error in dividing");
            e.printStackTrace();
            throw new RuntimeException(e); // this is exception chaining
        } finally {
            return -1;
        }
    }

    private static void example2(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static void example3(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
    }

    private static void example1() {
        try {
            Integer.parseInt("5");
            Integer.parseInt("a");
        } catch (Exception e) {
            System.out.println("error in parsing");
            e.printStackTrace();
        }
    }

}
