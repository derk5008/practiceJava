package com.self.codebat.resursive;

public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int countPairs(String str){
		
		int total =0;
		if(str.length()<=2) return 0;
		
		if(str.substring(0,1).equals(str.substring(2, 3))){
			
			total = 1 + countPairs(str.substring(1));
			
		}else {
			total = countPairs(str.substring(1));
		}
		
		return total;
		
	}

}
