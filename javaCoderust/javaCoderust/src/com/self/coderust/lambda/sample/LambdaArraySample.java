package com.self.coderust.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class LambdaArraySample {

	 public static void main(String [] a)  {
		 
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	 
	        System.out.println("Print all numbers:");
	        evaluate(list, (n)->false);
	 
	        System.out.println("Print no numbers:");
	        evaluate(list, (n)->false);
	 
	        System.out.println("Print even numbers:");
	        evaluate(list, (n)-> n%2 == 0 );
	 
	        System.out.println("Print odd numbers:");
	        evaluate(list, (n)-> n%2 == 1 );
	 
	        System.out.println("Print numbers greater than 5:");
	        evaluate(list, (n)-> n > 5 );
	 
	    }
	 
	    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
	        for(Integer n: list)  {
	            if(predicate.test(n)) {
	                System.out.println(n + " ");
	            }
	        }
	    }
}
