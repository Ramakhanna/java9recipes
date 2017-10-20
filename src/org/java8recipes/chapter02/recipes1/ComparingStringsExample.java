package org.java8recipes.chapter02.recipes1;

public class ComparingStringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "one";
		String two = "two";
		
		String var1 = "one";
		String var2 = "Two";
		
		String pieceone = "o";
		String piecetwo = "ne";
		// Comparison is equal
		if (one.equals(var1)) {
			System.out.println("String one equals var1 using equals");
		}
		// Comparison is not equal
		if (one.equals(two)) {
			System.out.println("String one equals two using equals");
		}
		// Comparison is not equal
		if (two.equals(var2)) {
			System.out.println("String two equals varw using equals");
		}
		// Comparison is equal, but is not directly comparing string values using ==
		if (one == var1) {
			System.out.println("String one equals var1 using ==");
		}
		// Comparison is equal
		if (two.equalsIgnoreCase(var2)) {
			System.out.println("String two equals var2 using equalsIgnoreCase");
		}
		System.out.println("Trying to use == on strings that are pieced together");
		String piecedTogether = pieceone + piecetwo;
		// Comparison is equal
		if (one.equals(piecedTogether)) {
			System.out.println("The strings contain the same value using equals");
		}
		// Comparison is NOT equal using ==
		if (one == piecedTogether) {
			System.out.println("The string contains the same value using =");
		}
		
		//System.out.println(two.compareTo(var2));
		if(one.compareTo(var1)==0) {
			System.out.println("One is equal to var1 using compareTo()");
		}
		
	}

}
