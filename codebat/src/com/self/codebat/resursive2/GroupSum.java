package com.self.codebat.resursive2;

public class GroupSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={3, 4, 9, 1};
		System.out.println(groupSum(0, nums, 92));
	}

	public static boolean groupSum(int start, int[] nums, int target) {
		  
		
		// Base case: if there are no numbers left, then there is a
		  // solution only if target is 0. (the target is cutted off to 0 one by one....)
		  if (start >= nums.length) return (target == 0);
		  
		  // Key idea: nums[start] is chosen or it is not.
		  // Deal with nums[start], letting recursion
		  // deal with all the rest of the array.
		  
		  // Recursive call trying the case that nums[start] is chosen --
		  // subtract it from target in the call. 
		  //This is real evaluation about sum:
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  
		  // Recursive call trying the case that nums[start] is not chosen.
		  //This is "go ahead try next" 
		  if (groupSum(start + 1, nums, target)) return true;
		  
		  // If neither of the above worked, it's not possible.
		  return false;
		}
		
		
		
		public static boolean gsum(int start, int[] nums, int target){
			
			if(start>=nums.length) return target==0;
			
			if(gsum(start+1, nums, target-nums[start])) return true;
			
			if(gsum(start+1, nums, target)) return true;
			
			return false;
		}
	
		
		
		
		public static boolean groupSum6(int start, int[] nums, int target){
			
			if(start>=nums.length) return target==0;
			
			if (nums[start] == 6)
		        return groupSum6(start + 1, nums, target - nums[start]);
			
			if(groupSum6(start+1, nums, target-nums[start])) return true;
			
			if(groupSum6(start+1, nums, target)) return true;
			
			return false;
		}
		
		
		
		public static boolean groupNoAdj(int start, int[] nums, int target) {
			  
			if(start>=nums.length) return target==0;
			
			 return groupNoAdj(start + 2, nums, target - nums[start])
			            || groupNoAdj(start + 1, nums, target);
			
		}
		
		
		
		public boolean groupSum5(int start, int[] nums, int target) {

			if(start>=nums.length) return target==0;
			
			if (nums[start]%5==0){
				
				if (start < nums.length - 1 && nums[start + 1] == 1)
		            return groupSum5(start + 2, nums, target - nums[start]);
		        
				return groupSum5(start + 1, nums, target - nums[start]);
				
			}
			
			 return groupNoAdj(start + 1, nums, target - nums[start])
			            || groupNoAdj(start + 1, nums, target);
			
			
		}

		
		public static boolean groupSumClump(int start, int[] nums, int target) {
			  

			if(start>=nums.length) return target==0;
			
			
				int count = 1;
				while (start+count < nums.length && nums[start+count] == nums[start]) {
				count++;
				}
				boolean sumIncludes = groupSumClump(start+count, nums, target-(nums[start]*count));
				boolean sumExcludes = groupSumClump(start+count, nums, target);

				return sumExcludes || sumIncludes;
			
			
		}

		
		
		
		public static boolean splitArray(int[] nums) {
			  
		return helper(0, nums, 0, 0);	
			
		}
		
		private static boolean helper(int start, int[] nums, int sum1, int sum2) {
		    if (start >= nums.length) return sum1 == sum2;
		    return helper(start + 1, nums, sum1 + nums[start], sum2)
		            || helper(start + 1, nums, sum1, sum2 + nums[start]);
		}
		
		
		public boolean splitOdd10(int[] nums) {
			return helper2(0, nums, 0, 0);
		}
		
		private boolean helper2(int start, int[] nums, int sum1, int sum2) {
		    if (start >= nums.length)
		        return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1
		                && sum2 % 10 == 0;
		    return helper2(start + 1, nums, sum1 + nums[start], sum2)
		            || helper2(start + 1, nums, sum1, sum2 + nums[start]);
		}
		
		
		
		public boolean split53(int[] nums) {
		    return helper3(0, nums, 0, 0);
		}
		 
		private boolean helper3(int start, int[] nums, int sum1, int sum2) {
		    if (start >= nums.length) return sum1 == sum2;
		    if (nums[start] % 5 == 0)
		        return helper3(start + 1, nums, sum1 + nums[start], sum2);
		    if (nums[start] % 3 == 0)
		        return helper3(start + 1, nums, sum1, sum2 + nums[start]);
		 
		    return helper3(start + 1, nums, sum1 + nums[start], sum2)
		            || helper3(start + 1, nums, sum1, sum2 + nums[start]);
		}
}
