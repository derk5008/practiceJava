package com.self.coderust.list;

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