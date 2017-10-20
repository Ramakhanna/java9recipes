package org.java8recipes.chapter02.recipes1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcheres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love Jython Y 2!";
		Boolean bool=false;
		Pattern patt = Pattern.compile("I love .*[ 0-9]!");
		Matcher match= patt.matcher(str);
		bool = match.matches();
		
		System.out.println(bool);
		
	}

}
