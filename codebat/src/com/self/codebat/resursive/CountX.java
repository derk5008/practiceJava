package com.self.codebat.resursive;

public class CountX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "esfxdxfdx";

		System.out.println(countX(str));
	}

	public static int countX(String str) {

		int total = 0;
		
		if(str.length()==0){
			
			if(str.equals("x")){
				
				return 1;
				
			}else {
				return 0;
			}
			
		} else {
			
			if(str.endsWith("x")){
				total = 1+ countX(str.substring(0, str.length()-1));
				
			}else {
				
				total = 0+ countX(str.substring(0, str.length()-1));
				
			}
			
			return total;
		}
		
		
		
	}

}
