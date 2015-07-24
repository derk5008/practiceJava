package com.self.codebat.resursive;

public class Factorial {
	
	
	public int facIterator(int index){
		
		int result =1;
		
		for(int i=index; i>=1; i--){
			result = result*i;
			
		}
		return result;
	}
	
	public int factRecursive(int i){
		
		if(i==1) return 1;
		
		return i*factRecursive(i-1);
		
		
		
	}

	
	
	public int facRecursive(int index){
		
		//this is exit point;
		if(index==1) return 1;
		
		//recursive
		return index*facIterator(index-1);
		
		
	}
	
	
	
	
	
	
	
}
