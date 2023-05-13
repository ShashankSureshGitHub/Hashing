package com.hashing;

import java.util.ArrayList;
import java.util.Iterator;

//TimeComplexity................O(m*(m+n))
//space complexity..............O(1)
public class IntersectionOfTwoArraysNAiveApproach {

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int size1, int size2) {

		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 0; i < size1; i++) {
			int flag = 0;

			for (int j = i + 1; j < size1; j++) {
				if (arr1[i] == arr1[j]) {
					flag = 1;
					break;
				}

			}
			if (flag == 1)
				continue;

			for (int j = 0; j < size2; j++) {
				if (arr1[i] == arr2[j]) {
					ar.add(i);
					break;
				}
			}
		}
		return ar;

	}

	public static void main(String[] args) {
		int[] array1 = { 5, 8, 5, 7, 8, 9 };
		int[] array2 = { 1, 5, 5, 8, 1, 8, 7 };

		ArrayList<Integer> arrayList = intersection(array1, array2, array1.length, array2.length);
		System.out.println(arrayList);
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
