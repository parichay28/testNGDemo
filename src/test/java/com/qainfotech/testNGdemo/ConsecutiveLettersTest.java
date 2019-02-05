package com.qainfotech.testNGdemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.junit.*;
public class ConsecutiveLettersTest {
	
	@Test
	public void testLowerLetters() {
		ConsecutiveLetters checkWords = new ConsecutiveLetters();
		
		ArrayList<String> inputWords = new ArrayList<String>();
		inputWords.add("hello");
		inputWords.add("bellow");
		inputWords.add("winter");
		
		ArrayList<String> expectedWords = new ArrayList<String>();
		expectedWords.add("hello");
		expectedWords.add("bellow");

		
		ArrayList<String> actualWords = checkWords.getWords(inputWords); 
		AssertJUnit.assertEquals(expectedWords, actualWords);
		
	}
	
	@Test
	public void testCapitalLetters() {
		ConsecutiveLetters checkWords = new ConsecutiveLetters();
		ArrayList<String> inputWords = new ArrayList<String>();
		inputWords.add("HELLO");
		inputWords.add("BELLOW");
		inputWords.add("WINTER");
		
		ArrayList<String> expectedWords = new ArrayList<String>();
		expectedWords.add("HELLO");
		expectedWords.add("BELLOW");

		
		ArrayList<String> actualWords = checkWords.getWords(inputWords); 
		AssertJUnit.assertEquals(expectedWords, actualWords);
		
	}
	
	@Test
	public void testMixedLetters() {
		ConsecutiveLetters checkWords = new ConsecutiveLetters();
		ArrayList<String> inputWords = new ArrayList<String>();
		inputWords.add("HELlO");
		inputWords.add("BElLOW");
		inputWords.add("WiNtER");
		
		ArrayList<String> expectedWords = new ArrayList<String>();
		expectedWords.add("HELlO");
		expectedWords.add("BElLOW");

		
		ArrayList<String> actualWords = checkWords.getWords(inputWords); 
		AssertJUnit.assertEquals(expectedWords, actualWords);
		
	}

}
