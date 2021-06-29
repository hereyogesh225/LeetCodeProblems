package com.leetcode.examples;

import java.util.Arrays;

/*Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:

Input: s = " "
Output: 0 
*/
public class Length_Of_Last_Word_58 {
	
	public static void main(String[] argrs) {
		System.out.println(lengthOfLastWord(" "));
	}

	private static int lengthOfLastWord(String s) {
		
		String[] split = s.trim().split(" ");
		
		String result=split[split.length-1];
		
		return result.trim().length();
	}
}
