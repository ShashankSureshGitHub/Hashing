package com.hashing;

import java.util.Arrays;

//time complexity.....1. sort method--O(nlogn)
// 2.  To count the distinct element  O(n)

// hence O(nlogn)+O()======O(nlogn)

// space complexity is....O(1)
public class CountDistinctElementSortingApproach {

	public static int countDistinctElement(int[] arr, int size) {

		int count = 0;

		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			while (i < size - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] array = { 10, 20, 10, 30, 30, 50, 40 };
		System.out.println(countDistinctElement(array, array.length));

	}

}
