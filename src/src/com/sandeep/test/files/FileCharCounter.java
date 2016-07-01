package com.sandeep.test.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by smalik3 on 6/18/16
 */
public class FileCharCounter {

    public int countChars(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalChars = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            totalChars = totalChars + line.length();
        }
        return totalChars;
    }

    public int countNonSpaceChars(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalChars = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c != ' ') {
                    totalChars++;
                }
            }
        }
        return totalChars;
    }

    public int countVowels(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalChars = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    totalChars++;
                }
            }
        }
        return totalChars;
    }

    public int countNonVowels(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalChars = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ') {
                    totalChars++;
                }
            }
        }
        return totalChars;
    }

    public int countNonVowels1(String filePath) throws IOException {
        return countNonSpaceChars(filePath) - countVowels(filePath);
    }

    public int countWords(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalWords = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            final String[] words = line.split(" ");
            totalWords = totalWords + words.length;
        }
        return totalWords;
    }

    public static void main(String[] args) throws IOException {
        FileCharCounter fileCharCounter = new FileCharCounter();
        final String filePath = "/Users/smalik3/Read me.txt";
        int chars = fileCharCounter.countChars(filePath);
        System.out.println("total chars: " + chars);
        int nonSpaceChars = fileCharCounter.countNonSpaceChars(filePath);
        System.out.println("total non space chars: " + nonSpaceChars);
        int vowelChars = fileCharCounter.countVowels(filePath);
        System.out.println("total vowels: " + vowelChars);
        int nonVowelChars = fileCharCounter.countNonVowels(filePath);
        System.out.println("total non vowels: " + nonVowelChars);
        int words = fileCharCounter.countWords(filePath);
        System.out.println("total words: " + words);
    }
}
