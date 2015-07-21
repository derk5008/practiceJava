package com.self.coderust.list;

public class ILinkedList {
	
	private Node head;
	private int count;
	
	
	public ILinkedList(){
		
		head = new Node();
		count = 0;
		
	}
	
	//this is insert:
	public void add(Object data){
		
		Node node = new Node(data, null);		
		Node current = head;
		
		//run to the last item
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
        for (int i = 0; i < index && current.getNext() != null; i++) {
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
		
		Node current = head;

		// index must be within list
		if(index<0 || index>count){
			return null;
		}
		
		for(int i=0; i<index+1 &&current.getNext()!=null ; i++){
			
			current = current.getNext();
		}
		
      return current.getData();
    }
 

	// removes the element at the specified position in this list.
	public boolean remove(int index){
		
        // if the index is out of range, exit
        if (index < 0 || index > size()-1)
            return false;
 
        Node current= head;
        //this loop will stop at element one before the to-be-deleted one
        for (int i = 0; i < index; i++) {
        	//this means you want delete an time in somewhere out of list; or the list is empty
            if (current.getNext() == null)
                return false;
 
            current = current .getNext();
        }
        current.setNext(current.getNext().getNext());
        count--; // decrement the number of elements variable
        return true;
    }
 
 
    public int size()
    // returns the number of elements in this list.
    {
        return count;
    }
 
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
    
}
 
 
    

