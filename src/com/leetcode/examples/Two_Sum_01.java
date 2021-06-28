package com.leetcode.examples;

import java.util.Arrays;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/

public class Two_Sum_01 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
	}

	private static int[] twoSum(int[] nums, int target) {
		
		int[] result = new int[2];
//		
//		int begin_pointer=0;
//		int end_pointer=nums.length-1;
//		
//		while (begin_pointer < end_pointer) {
//			
//			if(nums[begin_pointer]+nums[end_pointer]==target) {
//				 result[0]=begin_pointer;
//				 result[1]=end_pointer;
//			}else {
//				begin_pointer++;
//				end_pointer--;
//			}			
//		}
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
			if(nums[i]+nums[j]==target) {
				return new int[] {i,j};
			}				
				
			}
		}
		return new int[] {0,0};
	}
}
