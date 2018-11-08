package com.harpreet.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.harpreet.WordLengthChecker;

public class WordLengthCheckerTestNG {

static Logger logger = Logger.getLogger(WordLengthCheckerTestNG.class);
	

	
	@Test(dataProvider="provideInput")
	public void testLengthChecker(String data,String expected) {
		int expectedLength = expected.length();
		String largestWord;
		if (data.length()>1)
		{
			largestWord  = WordLengthChecker.lengthChecker(data);
			Assert.assertTrue(expected.equals(largestWord));
			Assert.assertTrue(expectedLength  == largestWord.length());
			logger.debug("Largest Word is:" +largestWord);
			logger.debug("Length of Largest Word is:" +expectedLength);
		}
		else
		{
			largestWord  = WordLengthChecker.lengthChecker(null);
			Assert.assertNull(largestWord);	
			//logger.debug("Word is " +largestWord);
		}
		
	}
	
	
	@DataProvider(name="provideInput")
	public Object [][] getData()
	{
		return new Object[][]{{"This is Harpreet coding","Harpreet"},{"The fox jumped over the moon","jumped"},{"123hithere","123hithere"},{"",""},{"The sky is blue.","blue."}};
		
		
		
	}
	
	
}
