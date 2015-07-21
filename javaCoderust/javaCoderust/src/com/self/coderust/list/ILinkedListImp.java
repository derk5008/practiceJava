package com.self.coderust.list;

public class ILinkedListImp {
 
	private Node head;
	private int count;
	
	public ILinkedListImp(){
		head = new Node();
		count =0;
	}
	
	public int size(){
		return count;
	}
	
	public Object get(int index){
		Node current = head;
		for(int i=0; i<index+1; i++){
			current = current.getNext();
		}
		
		return current.getData();
	}
	
	public void append(Object data){
		Node current = head;
		Node temp = new Node(data, null);
		
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(temp);
		count++;
		
	}
	
	public void insert(Object data, int index){
		Node current = head;
		Node temp = new Node(data, null);
		
		for(int i=0; i<index && current.getNext()!=null; i++){
			current =current.getNext();
		}
		
	temp.setNext(current.getNext());
	current.setNext(temp);
		count++;
	}
	public boolean remove(int index){
		Node current = head;
		
		for(int i=0; i<index; i++){
			if(current.getNext()==null){ 
				return false;
						}
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
		count--;
		return true;
	}
	public String toString(){
		Node current = head;
		String out="";
		while(current.getNext()!=null){
			current = current.getNext();
			out= out+"["+ current.getData()+"] ";
		}
		return out;
	}
}
