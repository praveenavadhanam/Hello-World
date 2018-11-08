/**
 * 
 */
package com.harpreet.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.harpreet.WordLengthChecker;

/**
 * @author nawab
 *
 */
public class WordLengthCheckerTest {
	static Logger logger = Logger.getLogger(WordLengthCheckerTest.class);
	

	//test witha  valid input 
	@Test
	public void testLengthChecker() {
		String expected  = "Harpreet";
		int expectedLength = expected.length();
		String largestWord  = WordLengthChecker.lengthChecker("This is Harpreet Codingg");
		assertTrue(expected.equals(largestWord));
		assertTrue(expectedLength  == largestWord.length());
	}

	//test with null input 
	@Test
	public void testLengthCheckerWithNull() {
		String expected  = null;
		String largestWord  = WordLengthChecker.lengthChecker(null);
		assertNull(largestWord);
	}	
	
}
