package com.self.codebat.resursive;

public class CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(countHi("hisossshils"));
		String str ="hisohisssls";
//		System.out.println(str.replaceFirst("hi", ""));
		System.out.println(countHi(str));
	}

	public static int countHi(String str){
		
		int total =0;
		if(str.contains("hi")){
			total = 1+ countHi(str.replaceFirst("hi", ""));
			
		}
		
		return total;
	
	
}

}