package com.self.coderust.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class LambadaStreamSample {
	
	 public static void main(String [] a)  {
		 
		 
		 List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
//		 for(Integer n : list1) {
//		     int x = n * n;
//		     System.out.println(x);
//		 }
		  
		 //New way:
		 List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
		 
		 list2.forEach(l -> System.out.println(l*l));
		 
		 list2.stream().map((x) -> x*x).forEach(System.out::println); 
		 
		  
		 
		 
	 }
	
	
	
	
	
	

}
