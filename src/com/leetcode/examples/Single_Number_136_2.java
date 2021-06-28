package com.leetcode.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4*/

// Second Approach Problem 136
public class Single_Number_136_2 {

	public static void main(String[] argrs) {
		
		System.out.println(singleNumber(new int[]{2,2,1}));
		
		System.out.println(singleNumber(new int[]{4,1,2,1,2}));
		
	}
	
	private static int singleNumber(int[] nums) {
		
		int result = 0;
		for(int i : nums) {
			result^=i;
		}		
		return result;
    }
}
