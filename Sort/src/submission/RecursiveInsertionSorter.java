package submission;

public class RecursiveInsertionSorter {
	public static int[] sort(int[] unsorted) {
		return sort(unsorted, unsorted.length-1); // Don't touch
	}

	private static int[] sort(int[] unsorted, int endIndex) {
		if (endIndex == 0) {
			return unsorted;
		}
		else {
			sort(unsorted, endIndex - 1);
			int temp = unsorted[endIndex];
			int i = endIndex - 1;
			while ( i>- 1 && temp < unsorted[i]){
				unsorted[i + 1] = unsorted[i];
				i--;
			}
			unsorted[i + 1] = temp;
			return unsorted;
		}
		
	}
	
}
