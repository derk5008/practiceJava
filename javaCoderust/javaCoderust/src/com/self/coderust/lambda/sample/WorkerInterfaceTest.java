package com.self.coderust.lambda.sample;

public class WorkerInterfaceTest {
	
	 public static void execute(WorkerInterface worker) {
	        worker.doSomeWork("Test");
	    }
	 
	    public static void main(String [] args) {
	 
	        //invoke doSomeWork using Annonymous class
//	        execute(new WorkerInterface() {
//	            @Override
//	            public void doSomeWork() {
//	                System.out.println("Worker invoked using Anonymous class");
//	            }
//	        });
	     
	        //invoke doSomeWork using Lambda expression 
	        execute( (String p)->System.out.println("HAHAHAAH. That's Lambda! "+p));
	    }
	 

}
