package com.manjeet.test.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileAndMapDemo {


		public static void main(String[] args) throws IOException {
			findAllWords("/Users/smalik/newFile.cups");

		}
		
	    private static void findAllWords(String filePath) throws IOException {
	    	FileReader fileReader = new FileReader(filePath);
	    	BufferedReader bufferedReader = new BufferedReader(fileReader);
	    	
	    	Set<String> words = new HashSet<>();
	    	String line;
	    	while((line = bufferedReader.readLine()) != null) {
	    		System.out.println(line);
	    		final String[] parts = line.split(" ");
	    		for(int i = 0 ; i < parts.length; i++) {
	    			String part = parts[i];
	    			words.add(part);
	    			
	    		}
	    	}
	    	System.out.println("total Words");
	    	System.out.println(words.size());
	    	System.out.println("words:are");
	    	System.out.println(words);
	    	
	    }


	}


