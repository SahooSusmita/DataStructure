package com.otherpractice;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		PalindromNumber obj = new PalindromNumber();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for check");
		String number = scanner.next();
		obj.checkPalindromNumber(number);

	}

	public void checkPalindromNumber(String number) {
		char[] numarray = number.toCharArray();

		int i = 0;
		int right = number.length() - 1;
		for (int left = 0; left <= right; left++, right--) {
			if (numarray[left] == numarray[right]) {
				i++;
			}
		}
		if (i >= number.length() / 2)
			System.out.println("Palindrom Number");
		else
			System.out.println("Not Palindrom");
	}
	public void checkPalindromNumber1(String number) {
		char[] numarray = number.toCharArray();

		String firstString = null;
		String secondString = null;
		int right = number.length() - 1;
		for (int left = 0; left <= right; left++, right--) {
			 firstString = firstString + numarray[left];
			 secondString = secondString + numarray[right];
		}
		if (firstString.equals(secondString))
			System.out.println("Palindrom Number");
		else
			System.out.println("Not Palindrom");
	}

	public boolean checkPalindromNumber(int number){

		int rev =0;
		while(number>0){
			rev = rev*10+number%10;
			number = number/10;

		}
		if(number==rev)
			return true;
		else
			return false;
		
	}


}
