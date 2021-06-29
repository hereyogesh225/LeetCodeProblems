package com.leetcode.examples;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Traingle_118 {

	public static void main(String[] argrs) {

		System.out.println(generate(5));
	}

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		List<Integer> first_row = new ArrayList<Integer>();
		first_row.add(1);
		triangle.add(first_row);

		for (int i = 1; i < numRows; i++) {

			List<Integer> prev_row = triangle.get(i-1);

			List<Integer> row = new ArrayList<Integer>();
			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(prev_row.get(j) + prev_row.get(j - 1));
			}

			row.add(1);
			triangle.add(row);
		}

		return triangle;
	}
}
