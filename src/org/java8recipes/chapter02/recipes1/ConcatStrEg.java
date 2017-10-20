package org.java8recipes.chapter02.recipes1;

public class ConcatStrEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "Hello";
		String two = "Java8";
		String result = one.concat(" ".concat(two));
		System.out.println(result);
		result = one +" "+ two;
		System.out.println(result);
		StringBuffer buffer = new StringBuffer();
		buffer.append(one).append(" ").append(two);
		System.out.println(buffer);
		result = one.concat(" ".concat(two.substring(0, two.length()-1)));
		System.out.println(result);
	}

}
