package org.howard.edu.lsp.assignment2;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.HashMap;
import java.util.Map;



public class ReadFile {
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
  public static void main(String[] args) {
	  // TODO: use hashset
	  Map<String, Integer> words = new HashMap<String,Integer>();
	  String word;
    try {
      File myObj = new File("words.txt");
      Scanner sc = new Scanner(myObj);
      
      while (sc.hasNext()) { // while there are still words in the file
    	  word = sc.next().toLowerCase();
    	  
    	  // TODO: check for punctuation, numbers, length
    	  if (word.length() >= 4) {
    		  if ((words.containsKey(word))){
    	    		 words.put(word, words.get(word)+1);
    	    	 }
    	    	 else {
    	    		 words.put(word, 1);
    	    	 }  
    	  }
    	 
      }
      sc.close();
      System.out.println(words);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}