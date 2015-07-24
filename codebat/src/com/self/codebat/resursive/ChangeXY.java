package com.self.codebat.resursive;

public class ChangeXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "codex";
		System.out.println(change(str));

	}

	public static String change(String str){
		
		
		if(!str.contains("x")){
			return str;
		}else {
			
		return change(str.replaceFirst("x", "y"));	
					
		}
		
		
		
	}
}
