package com.self.coderust.list;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import sun.security.provider.certpath.OCSP.RevocationStatus;

public class ILinkedListV2 {

	private int count;
	private Node head;

	
	public ILinkedListV2(){
		count=0;
		head = new Node();
		
	}
	
public Object get(int index){
	Node current = head;
	
	for(int i=0; i<index+1&&current.getNext()!=null; i++){
		
		current = current.getNext();
		
	}
	return current.getData();
}

public Node getNode(int index){
	Node current = head;
	
	for(int i=0; i<index+1&&current.getNext()!=null; i++){
		
		current = current.getNext();
		
	}
	return current;
}
	
public int size(){
	return count;
}	
	

public void append(Object data){

	Node current = head;
	Node temp = new Node(data);
	while(current.getNext()!=null){
		current = current.getNext();
	}
	current.setNext(temp);
	count++;
}
	


public void insert(Object data, int index){
	
	Node current = head;
	Node temp = new Node(data);
	for(int i=0; i<index; i++){
		current=current.getNext();
	}
	
	temp.setNext(current.getNext());
	current.setNext(temp);
	count++;
}


public boolean remove(int index){
	
	Node current =head;
	for(int i=0; i<index; i++){
		if(current.getNext()==null){
			return false;
		}
		
		current=current.getNext();
		
	}
	
	current.setNext(current.getNext().getNext());
	count--;
	return true;
}





public void reverseBasic(){
	
	Node current = head;
	int endPoint = count;
	
	for(int i=0; i<endPoint; i++){
		current =current.getNext();
		this.insert(current.getData(), endPoint);
	}
	
	for(int i=0; i<endPoint; i++){
		remove(0);
	}
	
	
}

public void reverseBasic(int index){
	
	Node current=head;
	int endPoint = count;
	for(int i=0; i<index; i++){
	current = current.getNext();	
	}
	
	for(int i=index; i<endPoint; i++){
		current=current.getNext();
		this.insert(current.getData(), endPoint);
	}
	
	for(int i=index; i<endPoint; i++){
		this.remove(index);
	}

}



public void reverseListItearator(){
	
	  Node previousNode=head;  
	  Node nextNode;  
	  Node currentNode=head.getNext();
	  while(currentNode!=null)  
	  {  
	   nextNode=currentNode.getNext();  
	  // reversing the link 
	   if(previousNode==head){
		   currentNode.setNext(null);
		   head.setNext(nextNode);
	   }else {
	   currentNode.setNext(previousNode);
	   }// moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   
	   currentNode=nextNode;
	   System.out.println("now current list is: "+this);
	  }
	
	
}

public static Node reverseRecursive(Node node) {  
    if (node == null || node.next == null) {  
        return node;  
    }  
 
    Node remaining = reverseRecursive(node.next);  
    node.next.next = node;  
    node.next = null;  
    return remaining;  
}  


public String toString(){
	
	String out ="";
	Node current = head;
	while(current.getNext()!=null){
		current = current.getNext();
		out=out+"["+current.getData()+"],";
	}
	
	return out;
	
}
}