package org.java9recipes.chapter01.recipes1_02;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloMessage hm;
		hm = new HelloMessage();
		
		System.out.println(hm.getMessage());
		
		hm.setMessage("Hello, world");
		System.out.println(hm.getMessage());
	}

}
