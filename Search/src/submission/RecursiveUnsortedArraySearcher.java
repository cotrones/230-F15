package submission;

public class RecursiveUnsortedArraySearcher {
	
	public static int search(int[] a, int key) {
		return search(a, key, a.length-1); // Don't touch
	}
	
	// TODO: Implement this one
	private static int search(int[] a, int key, int endIndex) {
		// Returns the index of the key or
		// -1 if not found
		if (key == a[endIndex])
			return endIndex;
		else if (endIndex == 0)
			return -1;
		else
			return search(a, key, (endIndex - 1));
	}
	
}