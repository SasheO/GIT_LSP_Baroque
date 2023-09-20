package org.howard.edu.lsp.assignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteTextFile {
	BufferedWriter writer;
	String filepath;
	public WriteTextFile(String input_filepath) throws IOException {
		writer = new BufferedWriter(new FileWriter(input_filepath, true));
		filepath=input_filepath;
	    writer.close();
	}
	
	public void writeHashMap(HashMap<String, Integer> hashmap) throws IOException {
		String output_string = "";
		  for (String i : hashmap.keySet()) {
			  output_string = output_string + i + " " + hashmap.get(i)+"\n";
			}
		File file = new File(filepath);
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(output_string);

		br.close();
		fr.close();
	}


}
