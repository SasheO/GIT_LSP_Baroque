package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Collections;

/**
 * IntegerSet is a mathematical set made of integers only.
 * @author Mezisashe Ojuba
 * 
 */
public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();

	/**
	 * Creates an empty IntegerSet
	 */
	public IntegerSet() {
	}

	/**
	 * Creates an IntegerSet with elements passed in as set parameter
	 * @param set an ArrayList of Integers
	 */
	public IntegerSet(ArrayList<Integer> set) {
		// ensures there are no duplicates in the passed in set
		for (Integer i: set) {
			if (!this.set.contains(i)) {
				this.set.add(i);
			}
		}
	}

	/**
	* Clears the internal representation of the set. 
	*/
	public void clear() {
		this.set = new ArrayList<Integer>();
	};

	/**
	 * Returns the length of the IntegerSet
	 * @return the length of the IntegerSet
	 */
	public int length() {
		return this.set.size();
	}; 


	/**
	 * Checks if the set and another IntegerSet b passed in are equal (every element in this set is in b and every element in b is in this set)
	 * @param b the set that this method checks for equality with
	 * @return whether this set and b are equal
	 */
	public boolean equals(IntegerSet b) {
		// if lengths are equal and each element in this set is in b, then the IntegerSets are equal
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
		
	}; 

	/**
	 * Checks if the set contains a particular integer
	 * @param value the integer checked for
	 * @return whether value is in the set or not
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	};    

	/**
	 * Returns the numerically largest integer in the set.  throws NoSuchElementException for an empty set
	 * @return null if set is empty or the largest integer if the set is non-empty
	 */
	public Integer largest() {
		if (this.length() == 0 ){
			throw new NoSuchElementException("empty set");
		}
		return  Collections.max(this.set);
	}; 

	/**
	 * Returns the numerically smallest integer in the set. throws NoSuchElementException for an empty set
	 * @return the smallest integer if the set is non-empty
	 */
	public Integer smallest(){
		if (this.length() == 0 ){
			throw new NoSuchElementException("empty set");
		}
		return  Collections.min(this.set);
	};

	/**
	 * Adds an integer to the set if it is not already there
	 * @param item the integer to add to the set
	 */
	 public void add(int item) {
		 if (!this.set.contains(item)) {
			 this.set.add(item);
		 }
	 }; 

	 /**
	  * Removes an integer from the set if it is in the set, does nothing otherwise
	  * @param item the integer to remove from the set
		 */
	public void remove(int item) {
		if (this.set.contains(item)) {
			this.set.remove(Integer.valueOf(item));
		}
	}; 
	
	 /**
	  * Returns an ArrayList of the Integers in the set
	  * @return an ArrayList of the Integers in the set
		 */
	public ArrayList<Integer> getSet(){
		return (ArrayList<Integer>) this.set;
	}
	
	/**
	 * Modifies the current set to its union with another IntegerSet
	 * @param intSetb the other IntegerSet
	 */
	public void union(IntegerSet intSetb) {
		for (Integer i: intSetb.getSet()) {
			if (!this.set.contains(i)) {
				this.set.add(i);
			}
		}
	};

	/**
	 * Modifies the current set to its intersection with another IntegerSet
	 * @param intSetb the other IntegerSet
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: this.set) {
			if (intSetb.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}; 

	/**
	 * Modifies the current set to its difference from another IntegerSet
	 * @param intSetb the other IntegerSet
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: this.set) {
			if (!intSetb.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}; 

	/**
	 * Modifies the current set to its complement with another IntegerSet
	 * @param intSetb the other IntegerSet
	 */
	public void complement(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: intSetb.getSet()) {
			if (!this.set.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}

	/**
	 * Checks whether the set is empty or not
	 * @return if the set is empty or not
	 */
	public boolean isEmpty() {
		if (this.length()==0) {
			return true;
		}
		else {
			return false;
		}
	}; 

	/**
	 * Returns a string form of the set
	 * @return string form of the IntegerSet
	 */
	public String toString() {
		return this.set.toString();
	};	

}
