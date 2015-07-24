package com.self.codebat.resursive;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums ={1, 2, 3,11, 4};
	}

	
	public static int array11(int[] nums, int index){
		
		int total=0;
		
		if(nums.length==0){
			return 0;
		}
		
		if(index==nums.length-1){
			
			if(nums[index]==11){
				return 1;
			}else {
				return 0;
			}
			
		} else {
			
			if(nums[index]==11){
				total =1+ array11(nums, index+1);
			}else {
				total =0+ array11(nums, index+1);
			}
			
			
		}
		return total;
		
		
		
		
	}
}
