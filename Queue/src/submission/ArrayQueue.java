package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	@SuppressWarnings("unchecked")
	private T[] data = (T[]) new Object[105];
	private int head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		if (data[head] == null)
			data[head] = newEntry;
		else
			tail++;
			data[tail] = newEntry;
	}

	@Override
	public T dequeue() {
		if (!isEmpty()) {
			T temp = data[head];
			data[head] = null;
			if (head == data.length-1) {
				head = 0;
			}
			else {
				head++;
			}
			return temp;
		}
		return null;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return data[0];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return data[tail] == null;
	}

	@Override
	public void clear() {
		data[tail] = null;
	}
	
	public String toString() {
		String s = "";
		if (!isEmpty())
			s = data[head].toString();
		for (int i =  (head+1) % data.length; 
				 i <= (tail + data.length) % data.length; 
				 i =  (i + 1) % data.length)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}
	
	public static void main(String args[]) {
		ArrayQueue<String> aq = new ArrayQueue<String>();
		aq.enqueue("Thomas");
	}

}
