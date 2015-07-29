package com.self.codebat.resursive;

public class StrCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean strCopies(String str, String sub, int n) {
		  
		if(str.length()<sub.length()){
			return n==0;
		}
		if(str.equals(sub)){
			return n<=1;
		}
		
		if(str.substring(0, sub.length()).equals(sub)){
			
			return strCopies(str.substring(1), sub, n-1);
			
		}else {
			
		return	strCopies(str.substring(1), sub, n);
		}
		
		
	}

}
