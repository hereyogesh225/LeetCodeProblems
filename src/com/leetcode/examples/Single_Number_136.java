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

public class Single_Number_136 {

	public static void main(String[] argrs) {
		
		System.out.println(singleNumber(new int[]{2,2,1}));
		
		System.out.println(singleNumber(new int[]{4,1,2,1,2}));
		
	}
	
	private static int singleNumber(int[] nums) {
		
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
 		
		for(int i : nums) {
		
			if(numbers.containsKey(i)) {
				numbers.put(i, numbers.get(i)+1);
			}
			else {				
				numbers.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> map : numbers.entrySet()) {
			
			Integer key = map.getKey();
			Integer value = map.getValue();
			if(value==1) {
				return key;
			}
		}
		
		return 0;
    }
}
