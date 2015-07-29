package com.self.codebat.resursive;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int strCount(String str, String sub) {
		  
		if(str.length()<sub.length()){
			return 0;
		}if(str.length()==sub.length()){
			if(str.equals(sub)) return 1;
			else return 0;
		}
		else {
			
			
			if(str.subSequence(0, sub.length()).equals(sub)){
				
				return 1+ strCount(str.substring(sub.length()), sub);
						
				
			} else {
				return 0 + strCount(str.substring(1), sub);	
				
			}
			
		}
		
	
	}
}
