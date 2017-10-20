package org.java8recipes.chapter02.recipes1;

public class CharIterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Break down into Chars";
		for (char ch:str.toCharArray()) {
			System.out.println(ch);
		}
		for (int i=0; i<str.length();i++) {
			System.out.println(str.toUpperCase().charAt(i));
		}
	}

}
