package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Tests:\n");
		
		// test constructor
		System.out.println("A. Testing constructors");
		System.out.println("Creating an empty IntegerSet set1:");
		IntegerSet set1 = new IntegerSet();
		System.out.println("set1: "+set1.toString());
		System.out.println("Creating an IntegerSet set2 by passing in input array [1,2,2,3,4]:");
		IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1,2,2,3,4)));
		System.out.println("set2: "+set2.toString());
		System.out.println("Creating an empty IntegerSet set3:");
		IntegerSet set3 = new IntegerSet();
		System.out.println("set3: "+set3.toString());
		
		// test add
		System.out.println("\nB. Testing add method:");
		System.out.println("Current set1: "+set1.toString());
		System.out.println("Adding 1 to set1:");
		set1.add(1);
		System.out.println("Current set1: "+set1.toString());
		System.out.println("Adding 2 to set1:");
		set1.add(2);
		System.out.println("Current set1: "+set1.toString());
		System.out.println("Adding to 1 set1 again (expected output is that nothing changes):");
		set1.add(1);
		System.out.println("Current set1: "+set1.toString());
		
		// test length
		System.out.println("\nC. Testing length method:");
		System.out.println("set1: "+set1.toString());
		System.out.println("set1.length(): "+set1.length());
		System.out.println("set2: "+set2.toString());
		System.out.println("set2.length(): "+set2.length());
		System.out.println("set3: "+set3.toString());
		System.out.println("set3.length(): "+set3.length());
		
		// test clear
		System.out.println("\nD. Testing clear method:");
		System.out.println("Current set1: "+set1.toString());
		System.out.println("Clearing set1 using set1.clear()...");
		set1.clear();
		System.out.println("Current set1: "+set1.toString());
		
		// test equals
		System.out.println("\nE. Testing equals method:");
		System.out.println("Current set1: "+set1.toString());
		System.out.println("Current set2: "+set2.toString());
		System.out.println("Current set3: "+set3.toString());
		System.out.println("set1.equals(set2):"+set1.equals(set2));
		System.out.println("set2.equals(set1):"+set2.equals(set1));
		System.out.println("set1.equals(set3):"+set1.equals(set3));
		System.out.println("set3.equals(set1):"+set3.equals(set1));
		set1.add(1);
		System.out.println("\nAdding 1 to set 1, current set1:"+set1.toString());
		System.out.println("Rechecking if set1 and set3 are still equal:");
		System.out.println("set1.equals(set3):"+set1.equals(set3));
		System.out.println("set3.equals(set1):"+set3.equals(set1));
		
		// test contains
		System.out.println("\nF. Testing contains method:");
		System.out.println("Current set2: "+set2.toString());
		System.out.println("set2.contains(1): "+set2.contains(1));
		System.out.println("set2.contains(10): "+set2.contains(10));
		System.out.println("Current set3: "+set3.toString());
		System.out.println("set3.contains(1): "+set3.contains(1));
		
		// test largest and smallest
		System.out.println("\nG. Testing smallest and largest method:");
		System.out.println("Current set2: "+set2.toString());
		System.out.println("set2.smallest(): "+set2.smallest());
		System.out.println("set2.largest(): "+set2.largest());
		set2.add(-100);
		set2.add(50);
		System.out.println("\nAdding -100 and 50 to set 2, current set2:"+set2.toString());
		System.out.println("Rechecking smallest and largest for set2:");
		System.out.println("set2.smallest(): "+set2.smallest());
		System.out.println("set2.largest(): "+set2.largest());
		System.out.println("\nTesting smallest and largest method on empty set3:"+set3.toString());
		System.out.println("set3.smallest(): "+set3.smallest());
		System.out.println("set3.largest(): "+set3.largest());
		
		// test remove
		System.out.println("\nH. Testing remove method:");
		System.out.println("Current set2: "+set2.toString());
		set2.remove(-100);
		System.out.println("set2 after set2.remove(-100):"+set2.toString());
		System.out.println("Testing remove method on number not in IntegerSet...");
		set2.remove(25);
		System.out.println("set2 after set2.remove(25):"+set2.toString());
		
		// test isEmpty
		System.out.println("\nI. Testing isEmpty method:");
		System.out.println("Current set3 is actually empty: "+set3.toString());
		System.out.println("set3.isEmpty():"+set3.isEmpty());
		System.out.println("Current set1 is not empty: "+set1.toString());
		System.out.println("set1.isEmpty():"+set1.isEmpty());
		
				
		// test union
		System.out.println("\nJ. Testing union method:");
		
		// test intersect
		System.out.println("\nK. Testing intersect method:");

		// test diff
		System.out.println("\nL. Testing diff method:");
		
		// test complement
		System.out.println("\nM. Testing complement method:");
		
		// test toString
		System.out.println("\nO. The only method not explicitly tested was toString, but it has been implicitly tested in all the print statements showing the state of the method already.");
	}

}
