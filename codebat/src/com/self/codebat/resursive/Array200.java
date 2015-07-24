package com.self.codebat.resursive;

public class Array200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={3, 4, 40, 4, 6};
		System.out.println(array220(nums, 0));
	}
	
	
	public static boolean array220(int[] nums, int index){

		if(nums.length<2) return false;
		
		 
		if(nums[index+1]==10* nums[index]){
			return true;
		} else {
			
			
			if(index==nums.length-2){
				return false;
			}else {
				return array220(nums, index+1);
			}
			
			
			
			
		}
		
		
		
	}
	
	public static boolean array220V2(int[] nums, int index){
		
		if(nums.length<2) return false;
		
		if(index==nums.length-2){
			
			if(nums[index+1]==10* nums[index]){
				return true;
			}else {
				return false;
			}
		}
		else {
			
			if(nums[index+1]==10* nums[index]){
				return true;
			}else {
				return array220(nums, index+1);
			}
		}
	}

}
