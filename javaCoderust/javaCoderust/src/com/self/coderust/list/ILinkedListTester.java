package com.self.coderust.list;

public class ILinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILinkedListImp lList = new ILinkedListImp();
		 
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
        

        System.out.println("lList - print linkedlist: " + lList);
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList.get(3) - get 4th element: " + lList.get(3));
        
        lList.insert("B", 2);
        System.out.println("lList.insert:  - insert into 3rd element: " + lList);

        lList.remove(1);
        System.out.println("after remove second element: : " + lList);
        
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList - print linkedlist: " + lList);
        
        
        
	}

}
