package com.hashing;

// Time complexity......O(nlogn)+O(n)=O(nlogn)
// Space Complexity.....O(1)
import java.util.Arrays;

public class FrequencyOfElementsInArraySortingApproach {

	public static void frequency(int[] arr, int size) {

		Arrays.sort(arr); // O(nlogn)
		for (int i = 0; i < size; i++) { // O(n)
			int count = 0;
			while (i < size - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			count += 1;
			System.out.println(arr[i] + ":" + count);
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 2, 3, 4, 5, 6, 1 };
		frequency(array, array.length);

	}

}
