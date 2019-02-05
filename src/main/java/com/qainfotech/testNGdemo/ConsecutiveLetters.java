package com.qainfotech.testNGdemo;

import java.util.ArrayList;

public class ConsecutiveLetters {
	
	public ArrayList<String> getWords(ArrayList<String> inputWords){
		ArrayList<String> finalWords = new ArrayList<String>();
		int counter;
		String temp;
		
		for(String word: inputWords) {
			temp=word;
			word=word.toLowerCase();
			for(counter=1;counter<word.length();counter++) {
				
				if(word.charAt(counter-1) == word.charAt(counter)){
					finalWords.add(temp);
					break;
				}
				
			}
		
		}
		
		return finalWords;
	}
	


}
