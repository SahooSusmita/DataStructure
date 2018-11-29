package com.practice.search;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(binarySearchMethod(42));
	}
	public static int binarySearchMethod(int V) {
		int[] A = {10,14,19,26,31,42,44};
		int high = A.length;
		int low = 0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			System.out.println("Mid :"+mid);
			if(V==A[mid]) {
				return mid;
			}
			if(V>A[mid]) 
				low = mid+1;
			else
				high = mid-1;		
		}
		return 0;

	}

}
