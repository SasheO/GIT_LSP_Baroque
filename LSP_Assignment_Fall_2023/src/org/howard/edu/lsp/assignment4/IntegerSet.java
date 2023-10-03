package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();

	public IntegerSet() {
	}

	public IntegerSet(ArrayList<Integer> set) {
		// ensures there are no duplicates in the passed in set
		for (Integer i: set) {
			if (!this.set.contains(i)) {
				this.set.add(i);
			}
		}
	}

	public void clear() {
		this.set = new ArrayList<Integer>();
	};

	public int length() {
		return this.set.size();
	}; 


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

	public boolean contains(int value) {
		return this.set.contains(value);
	};    

	public int largest()  {
		return  Collections.max(this.set);
	}; 

	public int smallest() {
		return  Collections.min(this.set);
	};

	 public void add(int item) {
		 if (!this.set.contains(item)) {
			 this.set.add(item);
		 }
	 	}; 

	public void remove(int item) {
		if (this.set.contains(item)) {
			this.set.remove(item);
		}
	}; 
	
	public ArrayList<Integer> getSet(){
		return (ArrayList<Integer>) this.set;
	}

	public void union(IntegerSet intSetb) {
		for (Integer i: intSetb.getSet()) {
			if (!this.set.contains(i)) {
				this.set.add(i);
			}
		}
	};

	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: this.set) {
			if (intSetb.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}; 

	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: this.set) {
			if (!intSetb.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}; 

	public void complement(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer i: intSetb.getSet()) {
			if (!this.set.contains(i)) {
				temp.add(i);
			}
		}
		this.set = temp;
	}

	public boolean isEmpty() {
		if (this.length()==0) {
			return true;
		}
		else {
			return false;
		}
	}; 

	public String toString() {
		return this.set.toString();
	};	

}
