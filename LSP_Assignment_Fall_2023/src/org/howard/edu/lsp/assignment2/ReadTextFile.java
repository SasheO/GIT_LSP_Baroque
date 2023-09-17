package org.howard.edu.lsp.assignment2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadTextFile {
	String str; // will hold a string version of the file content
	
	public ReadTextFile(String filepath)  throws IOException {
		// constructor (named the same as class, returns nothing)
		Path fileName
        = Path.of("words.txt");

	    // Now calling Files.readString() method to read the file contents into a lowercase string
	    str = Files.readString(fileName);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		// Creating a path choosing file from local
        // directory by creating an object of Path class
        
	}
	
	public void printLines() {
        // Printing the string
        System.out.println(str);
	}
	
	public String[] getLines() {
		// Returns the lines in the document in a string array
		String lines[] = str.split("\\r?\\n");
		return lines;
	}
	
	public List<String> getTokens() {
		// Returns the words separated buy newlines, punctuation, spaces. It does not eliminate integers.
		
		List<String> tokens = new ArrayList<String>();
		
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
		    tokens.add(matcher.group());
		}


		return tokens;
	}
}
