package com.self.codebat.resursive;

public class StringClean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fxxssa";
		System.out.println(StringClean(str));
	}

	
	public static String StringClean(String str){
		
		
		if(str.length()<=1){
			return str;
		}
		
		else {
			
			if(str.substring(0, 1).equals(str.substring(1, 2))){
				return ""+StringClean(str.substring(1));
			}else {
				return str.substring(0, 1)+StringClean(str.substring(1));
			}
			
			
			
			
		}
		
		
		
	}
	
	
}

