package com.self.codebat.resursive;

public class BunnyEars2 {
	
	
	public static void main(String args[]){
		
	bunnyEarIterator(4);
		
	}
	
	public static int bunnyEarIterator(int num){
				
		if(num<2) return 2;
		int total =2;
		
		for(int i=2; i<=num; i++){
			
			if(i%2==0){
				total = 3+total;
			}else {
				total =2 +total;
			}
		}
		System.out.println(total);
		return total;
	}
	
	
	public static int bunnyEarRecursive(int num){
		int total =0;
		if(num==0) return 0;
		if(num%2==0){
			
			total= 3+bunnyEarIterator(num-1);
		}else {
			total =bunnyEarIterator(num-1);
		}
		 
		return total;
		
	}
	
	
	
}
