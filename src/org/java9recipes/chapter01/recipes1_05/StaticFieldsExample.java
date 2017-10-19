package org.java9recipes.chapter01.recipes1_05;

class StaticDemo{
	public static boolean oneValueForAllObjects=false;
	
}

public class StaticFieldsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		StaticDemo sd1=new StaticDemo();
		StaticDemo sd2=new StaticDemo();		
		
		System.out.println(sd1.oneValueForAllObjects);
		System.out.println(sd2.oneValueForAllObjects);		
		sd1.oneValueForAllObjects=true;
		System.out.println(sd1.oneValueForAllObjects);
		System.out.println(sd2.oneValueForAllObjects);
		*/
		System.out.println(StaticDemo.oneValueForAllObjects);
		StaticDemo.oneValueForAllObjects=true;
		System.out.println(StaticDemo.oneValueForAllObjects);
	}

}
