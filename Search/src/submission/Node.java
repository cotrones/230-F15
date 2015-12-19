package submission;
//had to make num and next visible
public class Node {
	int  num; // Entry in bag
	Node next; // Link to next node

		public Node(int i)
		{
			this(i, null);	
		} // end constructor
		
		public Node(int i, Node nextNode)
		{
			num = i;
			next = nextNode;	
		} // end constructor
}
