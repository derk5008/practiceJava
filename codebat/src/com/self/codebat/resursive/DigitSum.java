package com.self.codebat.resursive;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigitsIterator(9999));
	}

	
	public static int sumDigitsRecursive(int n){
		
		if(n<10) return n;
		int total = n%10+ sumDigitsRecursive(n/10);
		return total;
	}
	
	
	public static int sumDigitsIterator(int num){
		
		int total =0;
		while(num>=10){
			total = total + num%10;
			num = num/10;
		}
		return total+num;
	} 
	
	
	public static int sumDigits(int n){
		
		if(n<10) return n;
		
		return n%10 + sumDigits(n/10);
		
		
		
	}
	
	
}
