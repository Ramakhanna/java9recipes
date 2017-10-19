package org.java9recipes.chapter01.recipes1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
		String numberAsString="";
		@SuppressWarnings("unused")
		long numberAsLong;
		numberAsLong = 0;
		boolean numberIsValid=false;
		
		do{
			/*Ask the user for a number*/
			System.out.println("Please enter a number:");
			try{
				numberAsString=readIn.readLine();
				System.out.println("Entered String is "+ numberAsString);
				
			}
			catch(IOException ex){
				System.out.println(ex);
			}
			
			try{
				numberAsLong=Long.parseLong(numberAsString);
				numberIsValid=true;
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe);
			}
			
		}while(numberIsValid==false);
	}

}
