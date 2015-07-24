package com.self.codebat.resursive;

public class PowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int powerN(int a, int b){
		
		if(b==1){
			return a;
		}
		
		return a*powerN(a, b-1);
		
		
		
		
	}
	
}
