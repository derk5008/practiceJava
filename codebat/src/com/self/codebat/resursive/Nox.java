package com.self.codebat.resursive;

public class Nox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String noX(String str){
		
		if(!str.contains("x")){
			return str;
		}else{
			
		return noX(str.replaceFirst("x", ""));	
		}
		
		
	}
}
