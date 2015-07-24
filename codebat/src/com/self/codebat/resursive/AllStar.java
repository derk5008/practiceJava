package com.self.codebat.resursive;

public class AllStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		
				System.out.println(allStar(str));
	}

	public static String allStar(String str){
		
		if (str.length() <= 1)
	    {
	        // My end state: the input string has 0 or 1 characters - no way to add hyphens!
	        return str;
	    }
	    else
	    {
	        // Return the first character of word, a hyphen, and the result of the recursive algorithm
	        return str.substring(0, 1) + "*" + allStar(str.substring(1));
	    }
		
	}
}
