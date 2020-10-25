package com.learn.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {	
		/**
		 * Challenge 1:
		 * Write the string leteral RegExp that will match the following string:
		 * "I want a bike."
		 * Use String.matches() to verify your answer
		 */
		String challenge1_text = "I want a bike.";
		System.out.println("Challenge 1: " + challenge1_text.matches("I want a bike."));
		
		/**
		 * Challenge 2:
		 * Write RegExp that will match the following string:
		 * "I want a bike." and "I want a ball."
		 * Use String.matches() to verify your answer
		 */
		// Solution 1
		String challenge2_text = "I want a ball.";
		System.out.println("Challenge 2: " + challenge1_text.matches("I want a.+"));
		System.out.println("Challenge 2: " + challenge2_text.matches("I want a.+"));
		// Solution 2
		System.out.println("Challenge 2: " + challenge1_text.matches("I want a (bike|ball)."));
		System.out.println("Challenge 2: " + challenge2_text.matches("I want a (bike|ball)."));
		// Solution 3
		System.out.println("Challenge 2: " + challenge1_text.matches("I want a \\w+."));
		System.out.println("Challenge 2: " + challenge2_text.matches("I want a \\w+."));
		
		/**
		 * Challenge 3
		 * Use the Matcher.matches() method to check for matches instead of String.matches()
		 * for the challenge 1 and 2
		 */
		String Challenge3_regExp = "I want a (bike|ball).";
		Pattern chellenge3_pattern = Pattern.compile(Challenge3_regExp);
		Matcher challenge3_matcher = chellenge3_pattern.matcher(challenge1_text);
		System.out.println("Challenge 3: " + challenge3_matcher.matches());
		challenge3_matcher = chellenge3_pattern.matcher(challenge2_text);
		System.out.println("Challenge 3: " + challenge3_matcher.matches());
		
		/**
		 * Challenge 4
		 * Replace all occurences of blank with underscore for the follwing string
		 * "Replace all blanks with underscore."
		 * print out the resulting string
		 */
		// Solution 1
		String challenge4_text = "Replace all blanks with underscore.";
		String challenge4_result = challenge4_text.replaceAll(" ", "_");
		System.out.println("Challenge 4 result: " + challenge4_result);
		// Solution 2
		challenge4_result = challenge4_text.replaceAll("\\s", "_");
		System.out.println("Challenge 4 result: " + challenge4_result);
		
		/**
		 * Challenge 5
		 * Write a RegExp that will match the following string in its entirety:
		 * "aaabccccccccdddefffg"
		 * Use String.matches() to verify your answer
		 */
		// Solution 1
		String challenge5_text = "aaabccccccccdddefffg";
		System.out.println("Challenge 5: " + challenge5_text.matches("^a{3}bc{8}d{3}ef{3}g$"));
		// Solution 2
		System.out.println("Challenge 5: " + challenge5_text.matches("[abcdefg]+"));
		// Solution 3
		System.out.println("Challenge 5: " + challenge5_text.matches("[a-g]+"));
		
		/**
		 * Challenge 6
		 * Write a RegExp that will match a string that start with a series of letters.
		 * the letters must be followed by a period "."
		 * After the period, there must be a series of digits.
		 * exmaples:
		 * "Kjsl.123" will match
		 * "f5.12a" will not
		 */
		// Solution 1
		System.out.println("Challenge 6: " + "Kjsl.123".matches("[A-Z][a-z]+\\.[0-9]+"));
		System.out.println("Challenge 6: " + "f5.12a".matches("[A-Z][a-z]+\\.[0-9]+"));
		// Solution 2
		System.out.println("Challenge 6: " + "Kjsl.123".matches("[A-Z][a-z]+\\.\\d+"));
		System.out.println("Challenge 6: " + "f5.12a".matches("[A-Z][a-z]+\\.\\d+"));
		
		/**
		 * Challenge 7
		 * Write a RegExp using a group, so thar we can print all the digits that occur in a string that contains
		 * multiple occurences of the pattern.
		 * Write all the code required to accompplish this.
		 * Use the following string to test your code:
		 * "abcd.135uvqz.7tzik.999"
		 * 
		 * There are three occurences of the pattern we looked for, when you run your code you should see:
		 * 135, 7, 999 printed to the console.
		 */
		String challenge7_text = "abcd.135uvqz.7tzik.999";
		String challenge7_regExp = "[A-Za-z]+\\.([0-9]+)";
		Pattern challenge7_pattern = Pattern.compile(challenge7_regExp);
		Matcher challenge7_matcher = challenge7_pattern.matcher(challenge7_text);
		
		int count = 0;
		while (challenge7_matcher.find()) {
			count++;
			System.out.println("Challenge 7 occurence " + count + ": " + challenge7_matcher.group(1));
		}
		
		/**
		 * Challenge 8
		 * Suppose we have the following string containing  points on a graph within curly braces.
		 * Extract what's in the curly braces:
		 * "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
		 */
		String challenge8_text = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
		String challenge8_regExp = "\\{(.+?)\\}";
		Pattern challenge8_pattern = Pattern.compile(challenge8_regExp);
		Matcher challenge8_matcher = challenge8_pattern.matcher(challenge8_text);
		
		count = 0;
		while (challenge8_matcher.find()) {
			System.out.println("Challenge 8: " + challenge8_matcher.group(1));
		}
		
		/**
		 * Challenge 9
		 * Write a RegExp that wil match a 5 digit US zip code,
		 * Use "85001" as your test string
		 */
		String challenge9_text = "85001";
		String challenge9_regExp = "[0-9]{5}";
		System.out.println("Challenge 9: " + challenge9_text.matches(challenge9_regExp));
		
	}

}
