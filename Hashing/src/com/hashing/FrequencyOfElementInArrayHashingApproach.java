package com.hashing;

import java.util.HashMap;
import java.util.Map;

// Time complexity.....O(n)
//Space Complexity.....O(n)
public class FrequencyOfElementInArrayHashingApproach {

	public static void frequency(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
			System.out.println(x.getKey() + ":" + x.getValue());
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 4, 5, 6 };
		frequency(array);

	}

}
