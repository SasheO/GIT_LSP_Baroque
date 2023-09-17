package org.howard.edu.lsp.assignment2;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class Test {
	
  public static void main(String[] args) throws IOException {
	  
	  ReadTextFile rf = new ReadTextFile("words.txt");
	  List<String> tokens = rf.getTokens();
	  Counter counter = new Counter();
	  HashMap<String, Integer> map = counter.countAlphabeticWords(tokens, 3);
	  
	  for (String i : map.keySet()) {
		  System.out.println( i + ": " + map.get(i));
		}
	  
	  
  }
}