package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Counter {
	
	public Counter() {
		
	}
	
	private boolean isNumber(String x) {
		// see if a string is a number
		try {
	        Object intValue = Integer.parseInt(x);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public HashMap<String, Integer> countAlphabeticWords(List<String> tokens, int minLength) {
		HashMap<String, Integer> counter = new HashMap<String, Integer>();
		
		// TODO: iterate through tokens, check if it has numbers, convert to .toLowerCase(), check length. add to counter hashset
		for (String s: tokens) {
			s = s.toLowerCase();
			if (isNumber(s)) {
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
	
	public HashMap<String, Integer> countTokens() {
HashMap<String, Integer> counter = new HashMap<String, Integer>();
		
		// TODO: iterate through tokens, check if it has numbers, convert to .toLowerCase(), check length. add to counter hashset
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
