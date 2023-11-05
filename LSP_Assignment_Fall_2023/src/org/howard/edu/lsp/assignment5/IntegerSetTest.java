package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

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
	@DisplayName("Test case for constructor with ArrayList<Integer> parameter")
	void testIntegerSet(ArrayList<Integer> set) {
		// TODO
	}
	
	@Test
	@DisplayName("Test case for constructor with no parameter")
	void testIntegerSet() {
		assertEquals(set1.getSet(), new ArrayList<Integer>());
	}
	
	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		set1.clear();
		set2.clear();
		set3.clear();
		set4.clear();
		assertEquals(set1.getSet(), new ArrayList<Integer>());
		assertEquals(set2.getSet(), new ArrayList<Integer>());
		assertEquals(set3.getSet(), new ArrayList<Integer>());
		assertEquals(set4.getSet(), new ArrayList<Integer>());	
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
		assertEquals(set1.largest(), null);
		assertEquals(set2.largest(), 4);
		set2 = new IntegerSet(new ArrayList<>(Arrays.asList(-50,1,2,2,3,4, 100)));
		assertEquals(set2.smallest(), -50);
		assertEquals(set4.smallest(), 4);
		assertEquals(set3.smallest(), 4);
	}
	

	@Test
	@DisplayName("Test case for smallest")
	void testSmallest() {
		assertEquals(set1.smallest(), null);
		assertEquals(set2.smallest(), 1);
		set2 = new IntegerSet(new ArrayList<>(Arrays.asList(-50,1,2,2,3,4, 100)));
		assertEquals(set2.largest(), 100);
		assertEquals(set4.largest(), 6);
		assertEquals(set3.largest(), 6);		
	}


	@Test
	@DisplayName("Test case for add")
	void testAdd() {
				
	}

	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
				
	}
	
	@Test
	@DisplayName("Test case for getSet")
	void testGetSet() {
				
	}
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
				
	}
	
	@Test
	@DisplayName("Test case for intersect")
	void testIntersect() {
				
	}
	
	@Test
	@DisplayName("Test case for diff")
	void testDiff() {
				
	}
	
	@Test
	@DisplayName("Test case for complement")
	void testComplement() {
				
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testIsEmpty() {
				
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testToString() {
				
	}
}
