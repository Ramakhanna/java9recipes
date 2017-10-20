package org.java8recipes.chapter02.recipes1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepPatMatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love Java 8!  It is my favorite language.  Java 8 is the "
                + "8th version of this great programming language.";
		Boolean bool=false;
		System.out.println("Original="+str);
		Pattern patt = Pattern.compile("[0-9]");
		Matcher match= patt.matcher(str);
		bool = match.matches();
		System.out.println(bool);
		System.out.println("Replaced+"+match.replaceAll("7"));
	}

}
