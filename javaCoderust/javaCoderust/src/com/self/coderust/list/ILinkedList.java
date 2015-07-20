package com.self.coderust.list;

public class ILinkedList {
	
	private Node head;
	private int count;
	
	
	public ILinkedList(){
		
		head = new Node();
		count = 0;
		
	}
	
	public void add(Object data){
		
		Node node = new Node(data, null);
		
		Node current = head;
		
		
		while(current.getNext()!=null){
			current = current.getNext();
			
			
		}
		current.setNext(node);
		count++;
		
	}
	
	
//	inserts the specified element at the specified position in this list
	public void add(Object data, int index)
    {
        Node temp = new Node(data, null);
        Node current = head;
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 1; i < index && current.getNext() != null; i++) {
        	current = current.getNext();
        }
        // set the new node's next-node reference to this node's next-node
        // reference
        temp.setNext(current.getNext());
        // now set this node's next-node reference to the new node
        current.setNext(temp);
        count++;// increment the number of elements variable
    }
	
	public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        
        if(index==0){
        	return head.getData();
        	}
        
 
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null)
                return current;
 
            current= current.getNext();
        }
        return current.getData();
    }
 
	// removes the element at the specified position in this list.
	public boolean remove(int index)
    // removes the element at the specified position in this list.
    {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
 
        Node crunchifyCurrent = head;
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return false;
 
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
        count--; // decrement the number of elements variable
        return true;
    }
 
 
    public int size()
    // returns the number of elements in this list.
    {
        return count;
    }
 
    public String toString() {
        Node crunchifyCurrent = head.getNext();
        String output = "";
        while (crunchifyCurrent != null) {
            output += "[" + crunchifyCurrent.getData().toString() + "]";
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        return output;
    }
    
}
 
 
    

