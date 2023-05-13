package com.hashing;

// Time complexity.......O(n)+O(n)+O(n)===O(n)
// space complexity......O(n)
import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArraysHashingApproach1 {

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {

		HashSet<Integer> hs1 = new HashSet<>();
		for (int i : arr1) {
			hs1.add(i);
		}
		HashSet<Integer> hs2 = new HashSet<>();
		for (int i : arr2) {
			hs2.add(i);
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i : hs1) {
			if (hs2.contains(i)) {
				arrayList.add(i);
			}
		}

		return arrayList;

	}

	public static void main(String[] args) {
		int[] array1 = { 5, 8, 5, 7, 8, 9 };
		int[] array2 = { 1, 5, 5, 8, 1, 8, 7 };

		System.out.println(intersection(array1, array2));
	}

}
