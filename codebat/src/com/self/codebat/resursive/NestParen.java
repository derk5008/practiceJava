package com.self.codebat.resursive;

public class NestParen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(())";
		System.out.println(nestParen(str));
	}

	
	public static boolean nestParen(String str) {
		 
		if(str.equals("")){
			return true;
		}
		if(str.length()<2){
			return false;
		}
		
		if(str.length()==2 && str.equals("()")){
			return true;
		}
		
		if(str.charAt(0)=='('){
			
			if(str.charAt(str.length()-1)==')'){
				return (nestParen(str.substring(1, str.length()-1)));
			}else {
				
				return nestParen(str.substring(0, str.length()-1));
				
			}
			
		}else {
			
			return nestParen(str.substring(1));
			
		}		
		
		
		
	}

}
