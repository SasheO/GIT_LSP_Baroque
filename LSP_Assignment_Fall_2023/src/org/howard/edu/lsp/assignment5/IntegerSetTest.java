package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.howard.edu.lsp.assignment4.IntegerSet;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	IntegerSet set1;
	IntegerSet set2;
	IntegerSet set3;
	IntegerSet set4;

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		set1 = new IntegerSet();
		set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1,2,2,3,4)));
		set3 = new IntegerSet(new ArrayList<>(Arrays.asList(4,5,6)));
		set4 = new IntegerSet(new ArrayList<>(Arrays.asList(5,6,4)));
	}
	
	@Test
	@DisplayName("Test case for constructor")
	void testIntegerSet() {
		assertTrue(set1.equals(new IntegerSet()));
	}
	
	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		// clear both empty and non-empty sets
		set1.clear();
		set2.clear();
		set3.clear();
		set4.clear();
		assertTrue(set1.equals(new IntegerSet()));
		assertTrue(set2.equals(new IntegerSet()));
		assertTrue(set3.equals(new IntegerSet()));
		assertTrue(set4.equals(new IntegerSet()));
	}
	
	@Test
	@DisplayName("Test case for length")
	void testLength() {
		assertEquals(set1.length(), 0);
		assertEquals(set2.length(), 4);
		assertEquals(set3.length(), 3);
		assertEquals(set4.length(), 3);
				
	}


	@Test
    @DisplayName("Test case for equals")
    public void testEquals() {
       // JUnit test case(s) for equal
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(-1,2,2,3,4)));
		assertTrue(set3.equals(set4));
		assertTrue(set4.equals(set3));
		assertFalse(set4.equals(set1));
		assertFalse(set1.equals(set4));
		assertFalse(set3.equals(set1));
		assertFalse(set2.equals(set3));
		assertFalse(set2.equals(set5));
		assertFalse(set5.equals(set2));
		assertTrue(set1.equals(new IntegerSet()));
    }
	

	@Test
	@DisplayName("Test case for contains")
	void testContains() {
		assertTrue(set2.contains(1));
		assertFalse(set2.contains(10));
		assertFalse(set1.contains(1));
		assertTrue(set3.contains(4));
		assertTrue(set3.contains(5));
		assertTrue(set3.contains(6));
		assertFalse(set3.contains(-1));
	}
	

	@Test
	@DisplayName("Test case for largest")
	void testLargest() {
		// check empty set. in this implementation, returns null
		assertEquals(set1.largest(), null);
		
		// check largest in non-empty sets
		assertEquals(set2.largest(), 4);
		assertEquals(set4.largest(), 6);
		assertEquals(set3.largest(), 6);
		// modify set2 and check new largest
		set2 = new IntegerSet(new ArrayList<>(Arrays.asList(-50,1,2,2,3,4, 100)));
		assertEquals(set2.largest(), 100);
	}
	

	@Test
	@DisplayName("Test case for smallest")
	void testSmallest() {
		// check empty set. in this implementation, returns null
		assertEquals(set1.smallest(), null);

		// check smallest in non-empty sets
		assertEquals(set2.smallest(), 1);
		assertEquals(set4.smallest(), 4);
		assertEquals(set3.smallest(), 4);	
		//edit set2 and check new smallest
		set2 = new IntegerSet(new ArrayList<>(Arrays.asList(-50,1,2,2,3,4, 100)));
		assertEquals(set2.smallest(), -50);
	
	}


	@Test
	@DisplayName("Test case for add")
	void testAdd() {
		// test adding number not already in set
		set1.add(1);
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(1)));
		assertTrue(set1.equals(set5));
		set1.add(2);
		set5 = new IntegerSet(new ArrayList<>(Arrays.asList(1,2)));
		assertTrue(set1.equals(set5));
		
		// test adding number already  in set
		set4.add(4);
		assertTrue(set4.equals(set3));
		set3.add(6);
		assertTrue(set3.equals(set4));
	}

	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
		// test remove element in set
		set2.remove(1);
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(2,3,4)));
		assertTrue(set2.equals(set5));
		set2.remove(3);
		set2.remove(4);
		set2.remove(2);
		assertTrue(set2.equals(set1));
		
		//test removing element not in set
		set3.remove(100);
		assertTrue(set3.equals(set4));
		
		//test removing element from empty set
		set1.remove(1); // should do nothing
		assertTrue(set1.equals(new IntegerSet())); // they should both be empty sets
	}
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
		// test union with empty set1
		set3.union(set1);
		assertTrue(set3.equals(set4)); // should still be equal
		
		// test union of sets containing some of the same element (4)
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
		set2.union(set4);
		assertTrue(set2.equals(set5)); // the union is equivalent IntegerSet set5
	}
	
	@Test
	@DisplayName("Test case for intersect")
	void testIntersect() {
		// test intersect of disjoint sets
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(99,100,-55)));
		set5.intersect(set2);
		assertTrue(set5.equals(new IntegerSet()));
		
		// test intersect of empty set and non-empty set
		set4.intersect(set1);
		assertTrue(set4.equals(new IntegerSet()));
		
		// test intersect of two non-empty sets with some common element(s)
		set3.intersect(set2);
		assertTrue(set3.equals(new IntegerSet(new ArrayList<>(Arrays.asList(4)))));
	}
	
	@Test
	@DisplayName("Test case for diff")
	void testDiff() {
		// test diff of disjoint sets
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(99,100,-55)));
		set5.diff(set2);
		assertTrue(set5.equals(new IntegerSet(new ArrayList<>(Arrays.asList(99,100,-55)))));
			
		// test diff of empty set and non-empty set
		set4.diff(set1);
		assertTrue(set4.equals(new IntegerSet(new ArrayList<>(Arrays.asList(4,5,6))))); // should still be the same as before
			
		// test diff of two non-empty sets with some common element(s)
		set3.diff(set2);
		assertTrue(set3.equals(new IntegerSet(new ArrayList<>(Arrays.asList(5,6)))));
	}
	
	@Test
	@DisplayName("Test case for complement")
	void testComplement() {
		// test complement of disjoint sets
		IntegerSet set5 = new IntegerSet(new ArrayList<>(Arrays.asList(99,100,-55)));
		set5.complement(set2);
		assertTrue(set2.equals(set5));
					
		// test complement of empty set and non-empty set
		set4.complement(set1);
		assertTrue(set4.equals(new IntegerSet())); // should be empty
					
		// test complement of two non-empty sets with some common element(s)
		set3.complement(set2);
		assertTrue(set3.equals(new IntegerSet(new ArrayList<>(Arrays.asList(1,2,3)))));	
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testIsEmpty() {
		// test empty set
		assertTrue(set1.isEmpty());
		
		// test non-empty set
		assertFalse(set2.isEmpty());
				
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testToString() {
		assertEquals(set1.toString(), "[]");
		assertEquals(set2.toString(), "[1, 2, 3, 4]");
	}
}
