package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
	public void clear() {
		this.set = new ArrayList<Integer>();
	};

	// Returns the length of the set
	public int length() {
		return this.set.size();
	}; 

	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		// check if everything in a is in b and the lengths are equal
		if (this.length() == b.length()){
			
			for (Integer i: this.set) {
				if (! b.contains(i)) {
					return false;
				}
			}
			
			return true;
			
		}
		else {
			return false;
		}
		
		return true;
		
	}; 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return this.set.contains(value);
	};    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest()  {
		return  Collections.max(this.set);
	}; 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() {
		return  Collections.min(this.set);
	};

		// Adds an item to the set or does nothing it already there	
	 	public void add(int item) {
	 		// add item, does nothing if already there
	 	}; // adds item to the set or does nothing if it is in set

		// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		// remove item
	}; 

	// Set union
	public void union(IntegerSet intSetb) {…};

	// Set intersection, all elements in s1 and s2
	public void intersect(IntegerSet intSetb) {…}; 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb); // set difference, i.e. s1 - s2

	// Set complement, all elements not in s1
	public void complement(IntegerSet intSetb) {
	}

	// Returns true if the set is empty, false otherwise
	boolean isEmpty(); 

	// Return String representation of your set
	public String toString() {…};	// return String representation of your set

}
