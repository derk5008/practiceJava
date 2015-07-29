package com.self.codebat.resursive.round2;

public class ParenBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="(xy)1";
	System.out.println(parenBit(str));
	
	}
	
	public static String parenBit(String str) {
		System.out.println(str);
		  if(str.length()<2){
				return "";
			}
		
		 if(str.charAt(0)=='('){
			 
			 
			 if(str.charAt(str.length()-1)==')'){
				 return str;
			 }else {
				 
				 return parenBit(str.substring(0, str.length()-1));
			 }
			 
			 
			 
			 
		 } else {
			 
			 return parenBit(str.substring(1));
		 }
		  
		  
		  
	}
	

}
