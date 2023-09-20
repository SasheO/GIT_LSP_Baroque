package org.howard.edu.lsp.assignment2;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;


public class Assignment2WordCounting {
	
  public static void main(String[] args) throws IOException, URISyntaxException {
	  ReadTextFile rf = new ReadTextFile("src/main/resources/words.txt");
	  List<String> tokens = rf.getTokens();
	  Counter counter = new Counter();
	  HashMap<String, Integer> map = counter.countAlphabeticWords(tokens, 3);
	  for (String i : map.keySet()) {
		  System.out.println( i + " " + map.get(i));
		}
	  
	  WriteTextFile wf = new WriteTextFile("src/main/resources/output.txt");
	  wf.writeHashMap(map);
	  
  }
}