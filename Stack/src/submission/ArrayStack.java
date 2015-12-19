package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	@SuppressWarnings("unchecked")
	private T[] data = (T[]) new Object[100];
	private int top = -1;

	@Override
	public void push(T newEntry) {
		top++;
		data[top] = newEntry;
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T temp = data[top];
			data[top] = null;
			top--;
			return temp;
		}
		return null;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return data[top];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public void clear() {
		top = -1;
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	public static void main(String args[]) {
		ArrayStack<String> as = new ArrayStack<>();
		as.push("Thomas");
		as.push("Gerald");
		as.pop();
		as.push("Cotroneo");
		as.peek();
	}

}
