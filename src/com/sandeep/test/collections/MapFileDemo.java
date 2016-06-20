package com.sandeep.test.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by smalik3 on 6/19/16
 */
public class MapFileDemo {

    public static void main(String[] args) throws IOException {
        List<String> lines = loadLines(false);
        System.out.println("total number of lines: " + lines.size());
        List<String> nonEmptyLines = loadLines(true);
        System.out.println("total number of non empty lines: " + nonEmptyLines.size());
        Set<String> words = splitIntoWords(lines);
        System.out.println("total words: " + words.size());
        System.out.println("average words per line: " + (words.size() / nonEmptyLines.size()));

        final Map<String, Integer> articles = countArticles(nonEmptyLines);
        System.out.println(articles);

    }

    private static Set<String> splitIntoWords(List<String> lines) {
        Set<String> words = new HashSet<>();
        for (String line : lines) {
            final String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++) {
                String part = parts[i];
                words.add(part);
            }
        }
        return words;
    }

    private static Map<String, Integer> countArticles(List<String> lines) {
        Map<String, Integer> articles = new HashMap<>();
        for (String line : lines) {
            final String[] parts = line.split(" ");
            for (int i = 0; i < parts.length; i++) {
                String part = parts[i];
                final String trimmed = part.trim();
                if (trimmed.equals("a") || trimmed.equals("an") || trimmed.equals("the")) {
                    if (!articles.containsKey(trimmed)) {
                        articles.put(trimmed, 0);
                    }
                    articles.put(trimmed, articles.get(trimmed) + 1);
                }
            }
        }
        return articles;
    }

    private static List<String> loadLines(boolean excludeEmptyLines) throws IOException {
        FileReader fileReader = new FileReader("/Users/smalik3/map.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (!excludeEmptyLines)
                lines.add(line);
            else {
                if (line.trim().length() > 0)
                    lines.add(line);
            }
        }
        return lines;
    }

}
