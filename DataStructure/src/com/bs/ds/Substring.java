package com.bs.ds;

public class Substring {

	public static void main(String[] args) {
		String str="07-06-2018 09:53:19";
		System.out.println("date "+str.substring(0, 9));
		System.out.println("time "+str.substring(11, 19));
	}

}
