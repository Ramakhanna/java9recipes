package org.java9recipes.chapter01.recipes1_05;

public class DeclarationsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean BooleanVal = true; /*By Default, it is false*/
//		char charVal = 'G'; /*Unicode UTF16*/
//		charVal='\u0490';
		
//		byte byteVal; /*8 bit -128 to 127*/
//		short shortVal; /*16 bit -32768 to 32767*/
//		int intVal; /*32 bit -2147483648 to 2147483647*/
//		long longVal; /*64 bit -2^63 to 2^63-1*/
		
//		float floatVal = 10.123423F; /*32 bit ieee 754*/
//		double doubleVal = 10.13243214231; /*64 bit ieee 754*/
		
		String message = "Darken the corner where you are!";
		message = message.replace("Darken", "Brighten");
		System.out.println(message);

	}

}
