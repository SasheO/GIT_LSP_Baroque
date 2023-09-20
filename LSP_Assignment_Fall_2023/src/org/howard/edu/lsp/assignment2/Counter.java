package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.util.List;

public class Counter {
	
	public Counter() {
		
	}
	
	private boolean containsNumber(String x) {
		// helper method to see if a string contains
	    char[] chars = x.toCharArray();
	    for(char c : chars){
	         if(Character.isDigit(c)){
	            return true;
	         }
	      }
	    return false;
	}
	
	public HashMap<String, Integer> countAlphabeticWords(List<String> tokens, int minLength) {
		HashMap<String, Integer> counter = new HashMap<String, Integer>();
		
		// iterates through tokens, check if it has numbers, convert to .toLowerCase(), check length. add to counter hashset
		for (String s: tokens) {
			s = s.toLowerCase();
			if (containsNumber(s)) {
				// do nothing
			}
			else if (s.length() <= minLength){
				// do nothing
			}
			else {
				if (counter.containsKey(s)) {
					counter.put(s, counter.get(s) + 1);
				}
				else {
					counter.put(s, 1);
				}
			}
		}
		
		return counter;
	}
	
	public HashMap<String, Integer> countTokens(List<String> tokens) {
HashMap<String, Integer> counter = new HashMap<String, Integer>();
		
		// counts tokens including numeric ones
		for (String s: tokens) {
			s = s.toLowerCase();
			
			
				if (counter.containsKey(s)) {
					counter.put(s, counter.get(s) + 1);
				}
				else {
					counter.put(s, 1);
				}
		}
		
		return counter;

		
	}

}
