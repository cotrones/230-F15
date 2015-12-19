package submission;

import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	private int numEntries = 0;
	
	@Override
	public void enqueue(T newEntry) {
		if (!isEmpty())
			tail = tail.next = new Node(newEntry);
		else
			head = tail = new Node(newEntry);
	}

	@Override
	public T dequeue() {
		T result = null;
		if (!isEmpty()) {
			result = head.data;
			head = head.next;
			numEntries--;
			return result;
		}
		return null;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return head.data;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void clear() {
		tail = null;
		head = null;
		numEntries = 0;
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
	
	public static void main(String args[]) {
		LinkedQueue<String> lq = new LinkedQueue<String>();
		lq.enqueue("Thomas");
		lq.enqueue("Gerald");
		lq.dequeue();
		lq.enqueue("Cotroneo");
		lq.peek();
	}

}
