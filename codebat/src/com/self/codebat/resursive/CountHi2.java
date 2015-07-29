package com.self.codebat.resursive;

public class CountHi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xahix2hi";
		System.out.println(countHi2(str));
//		System.out.println(str.substring(2,3));
	}		

	
	public static int countHi2(String str){
		
		if(str.length()<2){
			return 0;
		}
		if(str.length()==2){
			if(str.equals("hi")){
				return 1;
			}else{
				return 0;
			}
			
		}else {
			
			if(str.substring(0, 1).equals("x")){
				
				if(str.substring(1, 3).equals("hi")){
					return 0 + countHi2(str.substring(3));
				}else {
					return 0 + countHi2(str.substring(1));
				}
				
				
			}else {
				
				if(str.substring(0, 2).equals("hi")){
				return 1+ countHi2(str.substring(2));
			}else {
				return 0+ countHi2(str.substring(1));
				}
			}
		
		}
		
	}
		
}
