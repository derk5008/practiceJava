package com.self.codebat.resursive;

public class CountABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int countAbc(String str) {
		  
		if(str.length()<=2){
			return 0;
		}else {
			
		if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")){
			
			return 1 + countAbc(str.substring(1));
		}	else {
			return 0 + countAbc(str.substring(1));
		}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
