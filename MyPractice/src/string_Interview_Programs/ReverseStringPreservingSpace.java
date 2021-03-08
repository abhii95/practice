package string_Interview_Programs;

public class ReverseStringPreservingSpace {

	public static void main(String[] args) {

		String str = "internship at geeks for geeks";// "Help others";//"intern at geeks";//"King in the North";
		System.out.println(ReverseStringPreservingSpaces(str));

	}

	// Two pointer algorithm

	private static String ReverseStringPreservingSpaces(String str) {

		int startPointer = 0;
		int endPointer = str.length() - 1;
		char[] strArray = str.toCharArray();

		while (startPointer < endPointer) {

			if (strArray[startPointer] == ' ')
				startPointer++;

			else if (strArray[endPointer] == ' ')
				endPointer--;

			else {
				// swap
				char temp = strArray[startPointer];
				strArray[startPointer] = strArray[endPointer];
				strArray[endPointer] = temp;
				//
				startPointer++;
				endPointer--;
			}
		}

		return String.valueOf(strArray);

	}

}
