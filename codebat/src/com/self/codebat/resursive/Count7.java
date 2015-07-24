package com.self.codebat.resursive;

public class Count7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count7(714));
	}

	public static int count7Recursive(int n){
		int total =0;
		
		if(n<10){
			if(n%10==7){
				total=1; 
			}else {total =0; }
			return total;
		} else {
			
			if(n%10==7){
			total = 1+ count7(n/10);
			}else {
				
				total = 0+ count7(n/10);	
			}
			
		}
		
		return total;
		
		
	}
	
	public  static int count7(int n){
		
		if(n<10){
			
			if(n==7) return 1;
			else return 0;
			
		} else {
			
			if(n%10==7){
				return 1 + count7(n/10);
			}else {
				return count7(n/10);
			}
			
			
			
		}
		
		
		
	} 
}
