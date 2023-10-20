package org.howard.edu.lsp.midterm.problem2;

public class Range {
	private int lowerBound;
	private int upperBound;
	
	public Range(int int1, int int2) {
		if (int1 <= int2) {
			this.lowerBound = int1;
			this.upperBound = int2;
		}
		else {
			this.lowerBound = int2;
			this.upperBound = int1;
		}
	}
	
	public boolean isValueInRange(int value) {
		if ((this.lowerBound <= value) && (this.upperBound >= value)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getLowerBound() {
		return this.lowerBound;
	}
	
	public int getUpperBound() {
		return this.upperBound;
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		if (isValueInRange(otherRange.getLowerBound())) {
			return true;
		}
		else if (isValueInRange(otherRange.getUpperBound())){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int size() {
		int output = this.upperBound - this.lowerBound;
		return output + 1;
	}
}
