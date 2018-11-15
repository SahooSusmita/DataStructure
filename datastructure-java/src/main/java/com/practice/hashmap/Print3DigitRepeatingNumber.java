package com.practice.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Print3DigitRepeatingNumber {

	public static void main(String[] args) {
		Print3DigitRepeatingNumber obj = new Print3DigitRepeatingNumber();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map = obj.PrintNumber("123412345123456");
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "--" + e.getValue());

		}

	}

	public HashMap<String, Integer> PrintNumber(String Data) {

		char[] dataArray = Data.toCharArray();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < dataArray.length - 3; i++) {
			String num = Data.substring(i, i + 3);
			if (!(map.containsKey(num))) {
				for (int j = 0; j < dataArray.length - 3; j++) {
					if (num.equals(Data.substring(j, j + 3))) {
						if (map.containsKey(num)) {
							map.put(num, map.get(num) + 1);
						} else {
							map.put(num, 1);
						}
					}

				}
			}
		}

		return map;

	}

}
