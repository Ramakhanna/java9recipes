package org.java8recipes.chapter01.recipes1_11;

public class ReadOneEnvVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length>0) {
			String value=System.getenv(args[0]);
			if (value!=null){
				System.out.println(args[0].toUpperCase()+" "+value);
			}
			else {
				System.out.println("No such environmental variable exists");
			}
		}
		else {
			System.out.println("No arguments passed");
		}
	}

}
