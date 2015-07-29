package com.self.codebat.resursive.round2;

import java.lang.Character.Subset;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int factorial(int i) {

		if (i == 1)
			return 1;
		return i * factorial(i - 1);
	}

	public static int bunnyEars(int bunnies) {

		if (bunnies == 0) {
			return 0;
		}

		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {

		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static int bunnyEars2(int num) {

		if (num == 0)
			return 0;

		if (num % 2 != 0) {

			return 2 + bunnyEars2(num - 1);
		} else {
			return 3 + bunnyEars2(num - 1);
		}

	}

	public static int triangle(int row) {

		if (row <= 1)
			return row;

		return triangle(row - 1) + row;

	}

	public int sumDigits(int n) {
		if (n < 10)
			return n;

		return n % 10 + sumDigits(n / 10);

	}

	public int count7(int n) {

		if (n < 10) {
			if (n == 7)
				return 1;
			else
				return 0;
		}

		else {

			if (n % 10 == 7) {
				return 1 + count7(n / 10);
			} else {
				return 0 + count7(n / 10);
			}

		}
	}



	public int count8(int n) {
	
			if(n<10){
				if(n==8)return 1;
				else return 0;
			}
		
			if(n%10==8){
				
				if((n/10)%10==8){
					return 2+ count8(n/10); 
				}else {
					return 1+ count8(n/10);
				}
				
			}
			else {
				return 0+ count8(n/10);
			}	

	}
		
		
	
	public int powerN(int base, int n) {
		if(n==0) return 1;
		return base*powerN(base, n-1);
	}

	
	public int countX(String str) {
		
		if(str.length()==0) return 0;
		if(str.length()==1){
			if(str.equals("x")) return 1; 
			else return 0;
		}
		if(str.charAt(0)=='x'){
			return 1+ countX(str.substring(1));
		} else {
			return 0+ countX(str.substring(1));
		}
		
		
	}
	
	
	public int countHi(String str) {
	
		if(str.length()<2) return 0;
		if(str.substring(0, 2).equals("hi")){
			return 1+ countHi(str.substring(2));
		}else {
			
			return 0+ countHi(str.substring(1));
			
		}
		
	}

	public String changeXY(String str) {
		
		if(str.equals("")) return "";
		if(str.length()==1){
			if(str.equals("x")) return "y";
			else return  str;
		}
		if(str.charAt(0)=='x'){
			return "y"+ changeXY(str.substring(1));
		}else {
			return str.charAt(0)+changeXY(str.substring(1));
		}
		
		
	}

public String changeXY2(String str){
	
	if(!str.contains("x")){
		return str;
	}
	
	return changeXY2(str.replaceFirst("x", "y"));
	
		}

public String changePi(String str) {
	
if(!str.contains("pi")){
	return str;
}	
	
return changePi(str.replaceFirst("pi", "3.14"));

}

public String noX(String str) {

	if(!str.contains("x")){
		return str;
	}
	
	return noX(str.replaceFirst("x", ""));
	
	
}

public boolean array6(int[] nums, int index) {
	
	if(nums.length==0) return false;
	if(index==nums.length-1){
		if(nums[index]==6){
			return true;
		}else return false;
	}	
	
	if(nums[index]==6){
		return true;
	}else {
		return array6(nums, index+1);
	}
	
	
}


public int array11(int[] nums, int index) {
	
	if(nums.length==0){
		return 0;
	}
	
	if(index==nums.length-1){
		
		if(nums[index]==11){
			return 1;
		}else {
			return 0;
		}
		
	} 
	
	if(nums[index]==11) {
		return 1 + array11(nums, index+1);
	}else {
		return 0 + array11(nums, index+1);
	}
}

public boolean array220(int[] nums, int index) {


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

public String allStar(String str) {
	
	if(str.length()<=1) return str;
	return str.substring(0,1)+"*"+ allStar(str.substring(1));
	
	
			}


public String pairStar(String str) {
	
	if(str.length()<=1) return str;
	
	if(str.substring(0, 1).equals(str.substring(1, 2))){
		
		return str.substring(0, 1)+"*" + pairStar(str.substring(1));
	}else {
		
		return str.substring(0, 1) + pairStar(str.substring(1));
	}
	
	
}

public String endX(String str) {
	
	if(str.length()<=1) return str;
	
	if(str.substring(0, 1).equals("x")){
		return endX(str.substring(1))+"x";
		
	}else {
		return str.substring(0,1)+endX(str.substring(1)) ;
	}
	
}




public int countPairs(String str) {
	
	if(str.length()<=2) return 0;
	if(str.substring(0, 1).equals(str.substring(2, 3))){
		return 1 + countPairs(str.substring(1));
	}else {
		return 0 + countPairs(str.substring(1));
	}
	
	
}


public int countAbc(String str) {
	
	if(str.length()<3) return 0;
	
	if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")){
		return 1 + countAbc(str.substring(1));
	}else {
		return 0 + countAbc(str.substring(1));
	}
	
}


public int count11(String str) {
	 if(str.length()<=1)	return 0;
				
	if(str.substring(0, 2).equals("11")){
		return 1+ count11(str.substring(2));
	}else {
		return 0+ count11(str.substring(1));
	}
	 
	 
	 }

public String stringClean(String str) {

	if(str.length()<=1) return str;
	
	if(str.substring(0, 1).equals(str.substring(1, 2))){
		return ""+stringClean(str.substring(1));
	}
	else {
		return str.substring(0, 1)+stringClean(str.substring(1));
	}
	
	
}



public int countHi2(String str) {
	 if(str.length()<2){
				return 0;
			}
			if(str.length()==2){
				if(str.equals("hi")){
					return 1;
				}else{
					return 0;
				}
				
			}else {
				
				if(str.substring(0, 1).equals("x")){
					
					if(str.substring(1, 3).equals("hi")){
						return 0 + countHi2(str.substring(3));
					}else {
						return 0 + countHi2(str.substring(1));
					}
					
					
				}else {
					
					if(str.substring(0, 2).equals("hi")){
					return 1+ countHi2(str.substring(2));
				}else {
					return 0+ countHi2(str.substring(1));
					}
				}
			
			}
			
		  
	}

	public static int strDist(String str, String sub){
		
		if(str.length()<sub.length()) return 0;
		
		if(str.substring(0, sub.length()).equals(sub)){
			
			if(str.substring(str.length()-sub.length(), str.length()).equals(sub)){
				return str.length();
			}else {
				
				return strDist(str.substring(0, str.length()-1), sub);
			}
			
			
		}else {
			return strDist(str.substring(1, str.length()), sub);
		}
		
	}
	
	
	public static boolean strCopies(String str, String sub, int n){
		
		if(str.length()<sub.length()){
			return n==0;
		}
	
		if(str.substring(0, sub.length()).equals(sub)){
			
			return strCopies(str.substring(1), sub, n-1);
			
		} else {
			
		return	strCopies(str.substring(1), sub, n);
		}
		
		
	}
	
	

}


