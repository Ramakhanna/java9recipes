package org.java8recipes.chapter02.recipes1;

import java.util.Locale;

public class CaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This String will change case";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase(Locale.ITALIAN));
		System.out.println(str.toUpperCase(new Locale("tr", "US")));
	}

}
