package org.java8recipes.chapter02.recipes1;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "This is the original string";
		System.out.println(originalString.substring(0, originalString.length()));
		System.out.println(originalString.substring(3));
		System.out.println(originalString.substring(8, 18));
		System.out.println(originalString.substring(2,3));
	}

}
