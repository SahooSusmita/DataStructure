package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		RotationArray obj = new RotationArray();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size of Array :");
		int[] arry = new int[scan.nextInt()];
		System.out.println("Enter the  Array Elements :");
		for (int i = 0; i < arry.length; i++) {
			System.out.print(i + " element - ");
			arry[i] = scan.nextInt();
		}
		System.out.println("Enter the number of rotation :");
		int d = scan.nextInt();
		/*System.out.println("Before Rotation :" + Arrays.toString(arry));
		System.out.println("After Rotation Using Tmp :" + Arrays.toString(obj.rotateArrayUsingTemp(d, arry)));
		System.out.println("After Rotation Using OneByOne :" + Arrays.toString(obj.rotateArrayOnebyOne(d, arry)));
		System.out.println(
				"After Rotation Using JugglingAlgo :" + Arrays.toString(obj.rotateArrayJugglingAlgorithm(d, arry)));*/
		System.out.println(
				"After Rotation Using JugglingAlgo :" + Arrays.toString(obj.rotateUsingReverseTechnique(d, arry)));

	}

	// Time complexity : O(n)
	// Auxiliary Space : O(d)
	public int[] rotateArrayUsingTemp(int d, int[] arry) {
		int[] tmp = new int[d];
		for (int i = 0; i < tmp.length; i++) {
			tmp[tmp.length - 1 - i] = arry[i];
		}
		for (int i = 0; i < arry.length - d; i++) {
			arry[i] = arry[i + d];
		}
		for (int i = 0; i < tmp.length; i++) {
			arry[arry.length - 1 - i] = tmp[i];
		}
		return arry;

	}

	// Time complexity : O(n*d)
	// Auxiliary Space : O(1)
	public int[] rotateArrayOnebyOne(int d, int[] arry) {
		for (int i = 0; i < 3; i++) {
			int tmp = arry[0];
			for (int j = 0; j < arry.length; j++) {
				if (j < arry.length - 1)
					arry[j] = arry[j + 1];
				else
					arry[j] = tmp;
			}
		}
		return arry;
	}

	// Time complexity : O(d*d)
	// Auxiliary Space : O(1)
	public int[] rotateArrayJugglingAlgorithm(int d, int[] arry) {
		for (int i = 0; i < d; i++) {
			int tmp = arry[i];
			int j = i;
			while (j + d < arry.length) {
				arry[j] = arry[j + d];
				j = j + d;
			}
			arry[j] = tmp;
			j = i;
		}
		return arry;
	}

	public int[] rotateUsingReverseTechnique(int d, int[] array) {
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < d)
				arr1.add(array[i]);
			else {
				j = i - d;
				arr2.add(array[i]);
			}
		}
		Collections.reverse(arr1);
		Collections.reverse(arr2);
		arr1.addAll(arr2);
		Collections.reverse(arr1);
		for(int i = 0; i < arr1.size(); i++) {
			array[i] = arr1.get(i);
		}
		return array;

	}

}
