package org.java9recipes.chapter01.recipes1_09;

public class PassingArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>0){
			System.out.println("Arguments were passed to the program");
			for (String arg:args){
				System.out.println(arg);
			}
		}
		else {
			System.out.println("No arguments passed to the program");
		}
	}

}
