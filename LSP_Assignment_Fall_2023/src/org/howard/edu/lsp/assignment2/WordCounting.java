/**
 * Name: Mezisashe Ojuba
 */

package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.File; 

public class WordCounting {

	public static void main(String[] args) throws IOException {
		try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		System.out.println(System.getProperty("user.dir"));
//		System.out.println(System.getProperty("user.dir")+"\\src\\main\\resources\\words.txt");
		try {
			URL path = ClassLoader.getSystemResource("words.txt");
			System.out.println(path);
			if(path==null) {
			     //The file was not found, insert error handling here
			}
			File f = new File(path.toURI());

			BufferedReader reader = new BufferedReader(new FileReader(f));
			
			System.out.println(reader.readLine());
			reader.close();
		} catch (FileNotFoundException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
