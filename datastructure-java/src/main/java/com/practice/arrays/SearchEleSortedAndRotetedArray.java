package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEleSortedAndRotetedArray {

	public static void main(String[] args) {
		SearchEleSortedAndRotetedArray obj = new SearchEleSortedAndRotetedArray();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the Array :");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + i + " element - ");
			array[i] = scan.nextInt();
		}
		System.out.print("Key :");
		int key = scan.nextInt();
		//obj.getElementInRotatedArray(key, array);
		System.out.println("Found at index : " + obj.binarySearch(key, array));

	}

	private void getElementInRotatedArray(int key, int[] array) {
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				left.add(array[i]);
			} else {
				right.add(i);
			}
		}
		if (key > array[0]) {

		}
	}

	private int binarySearch(int key, int[] array) {
		int high = array.length - 1;
		int low = 0;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (array[mid] == key) {
				return mid;
			}
			if (array[low] > array[high]) {
				if (array[mid] > key && key > array[array.length - 1]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}else {
				if(array[mid]<key) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}

		return 0;
	}
}
