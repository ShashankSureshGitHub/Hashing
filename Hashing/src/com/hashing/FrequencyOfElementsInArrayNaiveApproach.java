package com.hashing;

// Time complexity.....O(n^2)
// space complexity.....O(1)
public class FrequencyOfElementsInArrayNaiveApproach {

	public static void frequency(int[] arr, int size) {

		for (int i = 0; i < size; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == true)
				continue;

			for (int j = 0; j <= i; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			System.out.println(arr[i] + ":" + count);
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 10, 20, 50 };
		frequency(array, array.length);
	}
}