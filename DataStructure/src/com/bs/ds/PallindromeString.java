package com.bs.ds;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number or word:");
		original=scanner.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse + original.charAt(i);
		if(original.equals(reverse))
			System.out.println(original+" is a palindrome number");
		else
			System.out.println(original+" is not a palindrome number");
	}

}
