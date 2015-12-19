package submission;

public class RecursiveUnsortedLinkedListSearcher {
	public static boolean search(Node a, int key) {
		// Returns true if the key is found or
		// false if not
		if (a == null)
			return false;
		else if (a.num == key)
			return true;
		else
			return search(a.next, key);
	}
	
}
