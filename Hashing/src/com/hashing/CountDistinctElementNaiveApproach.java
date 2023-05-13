package com.hashing;

// Time complexity- O(n^2)
// Space complexity-O(1)
public class CountDistinctElementNaiveApproach {

	public static int countDistinctElement(int[] arr, int size) {

		int count = 0;
		for (int i = 0; i < size; i++) {
			boolean flag = false;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}

			}
			if (flag == false)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 20, 30, 40, 40, 50, 70, 60, 10, 90 };
		System.out.println(countDistinctElement(array, array.length));
	}

}
