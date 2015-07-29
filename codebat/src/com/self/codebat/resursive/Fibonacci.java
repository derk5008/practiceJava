package com.self.codebat.resursive;

public class Fibonacci {

	
	public static void main(String[] args){
		
		
		System.out.println(fibs(5));
		
	}
	
	
	
	public static int fibs(int n){
		
		if(n<=1){
			return 1;
		}else {
			return fibs(n-1)+fibs(n-2);
		}
		
		
		
	}
	
	public int fibIterator(int a){
		
		
		
		if(a<=1) return a;
		int current=0;
		int p0 =0;
		int p1=1;
		for(int i=2; i<=a; i++){
			
			current = p0+p1;
			p0=p1;
			p1=current;
		}
		
		return current;
		
	}
	
	
	public int fibRecursive(int a){
		
		
		if(a<=1) return a;
		
		return fibRecursive(a-1)+fibRecursive(a);
		
		
		
	}
	
	
	public static int fib(int n){
		
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1) + fib(n-2);
		
	}
	
	public static int fibR(int n){
		
	 if(n<=1) return n;
	 int a=0;
	 int b=1;
	 int c=0;
	 for(int i=2; i<=n; i++){
		 c= a+b;
		 a=b;
		 b=c;
	 }
	 return c;
	}
	
}
