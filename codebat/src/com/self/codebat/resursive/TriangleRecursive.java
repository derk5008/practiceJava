package com.self.codebat.resursive;

public class TriangleRecursive {
	
	public static void main(String[]args){
		
		
	}
	
	
	public static int trangleRecursive(int row){
		
		if(row==0 || row==1) return row;
		
		return row+trangleIterator(row-1);
			
		
	}
	
	
	
	public static int trangleIterator(int row){
		
		if(row==0)
			return 0;
		
		int total=0;
		
		for(int i=1; i<=row; i++){
			
			total = total +i;
			
		}
		
		return total;
		
	}
	
	
	
	
	

}
