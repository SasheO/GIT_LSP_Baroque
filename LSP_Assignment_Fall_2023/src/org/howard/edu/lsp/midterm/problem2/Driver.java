package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Creating range1 = (5,10)");
		Range range1 = new Range(5, 10);
		System.out.println("Creating range2 = (8,15)");
	    Range range2 = new Range(8, 15);
	    System.out.println("Creating range3 = (4,4)");
	    Range range3 = new Range(4,4);
	    System.out.println("Creating range4 = (5,-1)");
	    Range range4 = new Range(5,-1);
	    
	    int testValue = 7;
	    System.out.println("\nTesting if " + testValue + " in range1:" + range1.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range2:" + range2.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range3:" + range3.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range4:" + range4.isValueInRange(testValue));
	    testValue = -1;
	    System.out.println("Testing if " + testValue + " in range1:" + range1.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range2:" + range2.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range3:" + range3.isValueInRange(testValue));
	    System.out.println("Testing if " + testValue + " in range4:" + range4.isValueInRange(testValue));

	    System.out.println("\nTesting doRangesOverlap:");
	    System.out.println("range1.doRangesOverlap(range2): " + range1.doRangesOverlap(range2));
	    System.out.println("range2.doRangesOverlap(range1): " + range2.doRangesOverlap(range1));
	    System.out.println("range2.doRangesOverlap(range3): " + range2.doRangesOverlap(range3));
	    System.out.println("range1.doRangesOverlap(range4): " + range1.doRangesOverlap(range4));
	    
	    System.out.println("\nTesting size:");
	    System.out.println("range1.size(): " + range1.size());
	    System.out.println("range2.size(): " + range2.size());
	    System.out.println("range3.size(): " + range3.size());
	    System.out.println("range4.size(): " + range4.size());
	}

}
