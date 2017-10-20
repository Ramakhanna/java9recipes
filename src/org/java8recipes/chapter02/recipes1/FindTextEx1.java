package org.java8recipes.chapter02.recipes1;

public class FindTextEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Here is a long String...let's find a match!";
		
		boolean bool = str.matches("Here is a long String...let's find a match!");
		System.out.println(bool);
		bool = str.matches("Here is a long String..");
		System.out.println(bool);
		
		str = "false";
		bool = str.matches("[tT]rue");
		System.out.println(bool);
		bool = str.matches("[Tt]rue|[fF]alse");
		System.out.println(bool);
		
		str = "I love Java7!";
		bool = str.matches("I love Java[0-9]!");
		System.out.println(bool);
		
		str = "I love Java!";
		bool = str.matches("I love .*[^0-9]!");
		System.out.println(bool);
		
		str = "I love Jython Y 2!";
		bool = str.matches("I love .*[ 0-9]!");
		System.out.println(bool);
	}

}
