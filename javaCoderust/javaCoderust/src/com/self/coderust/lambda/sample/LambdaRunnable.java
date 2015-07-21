package com.self.coderust.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class LambdaRunnable {

	public static void main(String[] args){
		
		//Old way:
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Hello from thread");
		    }
		}).start();
		 
		//New way: --Lambda directly pick up run() in Runnable
		new Thread(
		    () -> System.out.println("Hello from thread from lambda")
		).start();
		
		
		//Old way:
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list1) {
		    System.out.println(n);
		}
		 
		//New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list2.forEach(n -> System.out.println(n));
		 
		//or we can use :: double colon operator in Java 8
		list2.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
	
}
