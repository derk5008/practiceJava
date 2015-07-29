package com.self.codebat.resursive;

public class ParenBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="xyz(abc)123";
		String sub ="d";
//		System.out.println(parenBit(str));
		System.out.println(str.substring(str.length()-sub.length()));
	}

	public static String parenBit(String str){
//		if (str.equals("")) return str;
//		  if (str.charAt(0) == '(') {
//		    if (str.charAt(str.length()-1) == ')')
//		      return str;
//		    else
//		      return parenBit(str.substring(0, str.length()-1));
//		  } else
//		    return parenBit(str.substring(1));

			if(str.length()<2){
					return "";
				}
	
			if(str.substring(0, 1).equals("(")){
				
				if(str.charAt(str.length()-1)==')'){
					return str;
				}
				else {
					return parenBit(str.substring(0, str.length()-1));
				}	
				
				
			}else {
				
				return parenBit(str.substring(1));
			}
	
	
	
	}
	
}
