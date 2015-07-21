package com.self.coderust.list;

public class ILinkedListV2 {

	private int count;
	private Node head;

	public ILinkedListV2() {
		head = new Node();
		count = 0;
	}

	public Object get(int index) {

		Node current = head;
		for (int i = 0; i < index + 1 && current.next != null; i++) {
			current = current.next;
		}
		return current.getData();
	}

	public void append(Object data) {

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node temp = new Node(data, null);
		current.setNext(temp);
		count++;
	}

	public void insert(Object data, int index) {

		Node current = head;

		for (int i = 0; i < index && current.getNext() != null; i++) {
			current = current.next;
		}

		Node temp = new Node(data, null);
		temp.setNext(current.next);
		current.setNext(temp);
		count++;

	}

	public boolean remove(int index) {

		// some pre-codition
		Node current = head;
		for (int i = 0; i < index; i++) {
			if (current.next == null) {
				return false;
			}
			current = current.next;

		}

		current.setNext(current.getNext().getNext());

		count--;

		return false;
	}

	public int size() {
		return count;
	}

	public String toString() {

		String out = "The list is: ";
		Node current = head;
		while (current.next != null) {
			current = current.next;
			out = out + "[" + current.data + "], ";

		}

		return out;

	}

}
