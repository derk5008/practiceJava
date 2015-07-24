package com.self.codebat.resursive;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String pairStar(String str){
		
		if(str.length()<=1) return str;
		
		if(str.substring(0, 1).equals(str.substring(1,2))){
			
			return str.substring(0, 1)+"*"+pairStar(str.substring(1));
		}else {
			
			return str.substring(0, 1)+pairStar(str.substring(1));
		}
		
		
		
		
	}
}
