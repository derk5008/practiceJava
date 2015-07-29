package com.self.codebat.resursive;

public class Count11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count11("11x111x1111"));

	}
	public static int count11(String str) {
		if(str.length()<=1){
			return 0;
		}  else {
			
		if(str.substring(0,1).equals("1") && str.substring(1,2).equals("1")){
			return 1+ count11(str.substring(2));
		}	else {
			
			return 0+ count11(str.substring(1));
		}
			
			
		}
		
	}

}
