package com.self.coderust.lambda;

public class LambdaRunnableTest {

	public static void main(String[] args) {
		
	System.out.println("====== RunnableTest ======");
	
	// Anonymous Runnable: Inner class
	 Runnable r1 = new Runnable(){

		@Override
		public void run() {
			System.out.println("Hello world, this is Inner class ! ");
			
		}
		 
	 };    
	
	 Runnable r2 =()->System.out.println("Hello world, this is Lambda");
	 
	 r1.run();
	 r2.run();
	 
	}
	
	}

