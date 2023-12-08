package org.howard.edu.lsp.exam.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestLogger {
	
	/*
	 * Create TestLogger and implement JUnit test case called testDisplayLog. 
	 *  In addition, create JUnit test case testLoggerInstances where the 
	 *  intent is to determine if multiple instantiations of Logger(2 
	 *  should suffice) actually return the same instance.  
	 *  Look through the variety of assertions that exist and choose 
	 *  one that is appropriate.  Both implementation and test code can 
	 *  go in the same package.  
	 * */
	Logger logger;
	
	@BeforeEach
	void setUp() throws Exception {
		logger = Logger.loggerInstance();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	@DisplayName("Test case for if new log returns same instance")
	void testLoggerInstances() {
		Logger logger2 = Logger.loggerInstance();
		assertEquals(logger, logger2);
	}

	@Test
	@DisplayName("Test case for displayLog")
	void testDisplayLog() {
		fail("Not yet implemented");
	}

}
