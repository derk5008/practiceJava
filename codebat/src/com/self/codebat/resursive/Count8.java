package com.self.codebat.resursive;

public class Count8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count8(18818));
	}

	
	public static int count8(int n){
		if(n<10){
			
			if(n==8){
				return 1;
			}else {
				
			return 0;	
			}
		}
			else {
				
				if(n%10==8){
					
					if(((n/10)%10)==8){
						
					return 2+ 	count8(n/10);
					}else {
						return 1+ count8(n/10);
					}
					
					
				}else {
					
					return count8(n/10);
				}
			}	
		}
		
		
	}
