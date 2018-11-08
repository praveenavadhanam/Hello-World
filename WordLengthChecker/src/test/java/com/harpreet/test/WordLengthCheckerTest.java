/**
 * 
 */
package com.harpreet.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertNull;

import org.apache.log4j.Logger;
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
		AssertJUnit.assertTrue(expected.equals(largestWord));
		AssertJUnit.assertTrue(expectedLength  == largestWord.length());
	}

	//test with null input 
	@Test
	public void testLengthCheckerWithNull() {
		String expected  = null;
		String largestWord  = WordLengthChecker.lengthChecker(null);
		assertNull(largestWord);
	}	
	
}
