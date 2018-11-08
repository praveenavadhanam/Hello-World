package com.harpreet;

import org.apache.log4j.Logger;

public class WordLengthChecker {

	static Logger logger = Logger.getLogger(WordLengthChecker.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug( "largest word is  " + lengthChecker(args[0]) ) ;
		
	}

	public static String lengthChecker(String input) {
		int size = 0;
		String largestWord = null;
		String mySentence = null;
		String[] words = null;

		mySentence = input;
		if (mySentence == null)
			return largestWord;
		words = mySentence.split("\\s");
		for (int i = 0; i < words.length; i++) {
			logger.debug(words[i]);
			if (words[i].length() > size) {
				largestWord = words[i];
				size = words[i].length();
			}
		}
		logger.debug(("length is "+size));
		return largestWord;
	}

}
