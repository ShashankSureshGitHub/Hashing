package com.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArraysHashingApproach2 {

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {

		HashSet<Integer> hs1 = new HashSet<>();
		for (int i : arr1) {
			hs1.add(i);
		}
		ArrayList<Integer> hs2 = new ArrayList<>();

		for (int i = 0; i < arr2.length; i++) {
			if (hs1.contains(arr2[i])) {
				hs2.add(i);
				hs1.remove(i);
			}
		}

		return hs2;
	}

	public static void main(String[] args) {
		int[] array1 = { 5, 8, 5, 7, 8, 9 };
		int[] array2 = { 1, 5, 5, 8, 1, 8, 7 };

		System.out.println(intersection(array1, array2));
	}
}
