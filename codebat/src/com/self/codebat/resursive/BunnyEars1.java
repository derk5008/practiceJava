package com.self.codebat.resursive;

public class BunnyEars1 {

	public int bunnyEars(int n){
		
		if(n==0) return 0;
		
		return 2+bunnyEars(n-1);
		
		
	}
	
	
	
	
	
}
