package submission;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top = null;
	private int numEntries = 0;
	
	@Override
	public void push(T newEntry) {
		top = new Node(newEntry, top);
		numEntries++;
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T temp = top.data;
			top = top.next;
			numEntries--;
			return temp;
		}
		return null;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return top.data;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void clear() {
		top = null;	
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
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
		LinkedStack<String> ls = new LinkedStack<String>();
		ls.push("Thomas");
		ls.push("Gerald");
		ls.pop();
		ls.push("Cotroneo");
		ls.peek();
	}

}
