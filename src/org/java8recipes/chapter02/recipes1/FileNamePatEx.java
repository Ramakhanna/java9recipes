package org.java8recipes.chapter02.recipes1;

public class FileNamePatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length==1) {
		String filename=args[0];
			if (filename.endsWith(".txt")) {
				System.out.println("Text File");
			}else if (filename.endsWith(".xlsx")) {
				System.out.println("Excel File");
			}else {
				System.out.println("Someother file");
			}
		} 
		else {
			System.out.println("Enter only one Param");
		}
	}

}
