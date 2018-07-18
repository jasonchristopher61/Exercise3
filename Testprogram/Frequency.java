package Testprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	public  static void countEachWords(String fileName, Map<String, Integer>words) throws FileNotFoundException {
	        Scanner file= new Scanner(new File(fileName));

	        while(file.hasNext()) {
	            String word =file.next();

	            Integer count = words.get(word);

	            if(count!= null)
	                count++;
	            else
	                count=1;
	            words.put(word, count);
	        }
	        file.close();
	    }
	public  static String output()  {
		try {
		 Map<String, Integer> words = new HashMap<String, Integer>();
		    countEachWords("/home/jason/amm.txt", words);
		    String worddd=""+words;
		    System.out.println(worddd);
		    
			return worddd;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	  
	
	}
