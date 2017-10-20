package org.java8recipes.chapter02.recipes1;

public class StrToNumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "1";
		String two = "2";
		int result = Integer.parseInt(one)+Integer.parseInt(two);
		System.out.println(result);
		result = Integer.parseInt("FF", 16);
		System.out.println(result);
		result = Integer.valueOf(one)+Integer.valueOf(two);
		System.out.println(result);
		System.out.println(Integer.valueOf("14")+Integer.valueOf("-15"));
		System.out.println(Integer.parseInt("14")+Integer.parseInt("-15"));
		System.out.println(Integer.parseUnsignedInt("14")+Integer.parseUnsignedInt("15"));
		//System.out.println(Integer.parseUnsignedInt("14")+Integer.parseUnsignedInt("-15"));
	}

}
