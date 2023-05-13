package com.hashing;

import java.util.HashSet;

// time complexity....insertion of an element into set-O(1)
// for n elements......O(n)
// space complexity O(n).....hashset used
public class CountDistinctElementHashingApproach {

	public static int countDistinctElement(int[] array) {

		HashSet<Integer> hs = new HashSet<>();
		for (int i : array) {
			hs.add(i);
		}
		return hs.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 1, 2, 3, 4, 5 };
		System.out.println(countDistinctElement(array));
	}

}
