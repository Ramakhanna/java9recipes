package org.java9recipes.chapter01.recipes1_08;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi;
		String strval;
		pi = Double.parseDouble("3.14");
		strval=String.valueOf(pi);
		System.out.println(strval);
		System.out.println(Double.toString(pi));
	}

}
