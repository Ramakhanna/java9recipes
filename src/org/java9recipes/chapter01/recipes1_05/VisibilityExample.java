package org.java9recipes.chapter01.recipes1_05;

class TestClass{
	private long visibleOnlyInThisClass;
	double visibleFromEntirePackage;

	void setLong(long val){
		visibleOnlyInThisClass=val;
	}
	
	long getLong(){
		return visibleOnlyInThisClass;
	}
}

public class VisibilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc=new TestClass();
		tc.setLong(32768);
		tc.visibleFromEntirePackage=3.1415926535;
		System.out.println(tc.getLong());
		System.out.println(tc.visibleFromEntirePackage);
	}

}
