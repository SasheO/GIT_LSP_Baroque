package org.howard.edu.lsp.assignment2;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;


public class Test {
	
  public static void main(String[] args) throws IOException, URISyntaxException {
	  Path currentRelativePath = Paths.get("");
	  String s = currentRelativePath.toString();
	  System.out.println("Current absolute path is: " + s);
	  
	  ReadTextFile rf = new ReadTextFile("/main.resources/words.txt");
	  List<String> tokens = rf.getTokens();
	  Counter counter = new Counter();
	  HashMap<String, Integer> map = counter.countAlphabeticWords(tokens, 3);
	  
	  for (String i : map.keySet()) {
		  System.out.println( i + ": " + map.get(i));
		}
	  
	  
  }
}