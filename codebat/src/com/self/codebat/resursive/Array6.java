package com.self.codebat.resursive;

 

public class Array6 {

	
	public static void main(String[] args){
		
		int[] nums ={2,6, 5};
		System.out.println(array6(nums, 0));
		
	}
	
	public static boolean array6(int[] nums, int index){
		 
		if(nums.length==0 ) return false;
		
		if(index==nums.length-1){
			if(nums[index]==6){
				return true;
			}else {return false;
			
			
		}
		} else {
			if(nums[index]==6){
				return true;
			}else 
			 		return array6(nums, index+1);
			
		}
		
	}
	
}
