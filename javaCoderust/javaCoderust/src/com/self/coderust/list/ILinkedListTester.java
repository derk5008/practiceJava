package com.self.coderust.list;

public class ILinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILinkedListV2 lList = new ILinkedListV2();
        // add elements to LinkedList
        lList.append("1");
        lList.append("2");
        lList.append("3");
        lList.append("4");
        lList.append("5");
 
        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
        
        
        
        
        
        System.out.println("lList - print linkedlist before reverse: "+lList.size()+": "+ lList);
       lList.reverseListItearator();
        System.out.println("lList - print linkedlist after reverse: "+lList.size()+": "+ lList);
        
        
	}

}
