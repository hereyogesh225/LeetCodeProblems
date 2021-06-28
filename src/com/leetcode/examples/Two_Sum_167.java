package com.leetcode.examples;

import java.util.Arrays;

/*Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.*/

public class Two_Sum_167 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15}, 9)));
	}

	private static int[] twoSum(int[] numbers, int target) {

		int begin_pointer = 0;
		int end_pointer = numbers.length - 1;

		while (begin_pointer < end_pointer) {

			if (numbers[begin_pointer] + numbers[end_pointer] < target) {
				begin_pointer++;
			} else if (numbers[begin_pointer] + numbers[end_pointer] > target) {
				end_pointer--;
			} else {
				return new int[] { begin_pointer+1, end_pointer+1 };
			}
		}
		return new int[] { 0, 0 };
	}
}
