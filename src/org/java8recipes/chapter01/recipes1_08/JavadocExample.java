/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java8recipes.chapter01.recipes1_08;

import java.math.BigInteger;

/**
 *
 * @author ramakhanna
 */
/**
 * Accepts unlimited number of values and
 * returns the sum
 * @param nums must be an array of BigInteger values.
 * @return Sum of all numbers in the array.
 */

public class JavadocExample {

    /**
     * @param args the command line arguments
     */
    public static BigInteger addNumbers(BigInteger[] nums) {
    		BigInteger result=new BigInteger("0");
    		for (BigInteger num:nums) {
    			result =result.add(num);
    		}
    		return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("test");   
     BigInteger[] someValues = {BigInteger.TEN,BigInteger.ONE,BigInteger.ONE};
     System.out.println(addNumbers(someValues));
     
    }
    
}
