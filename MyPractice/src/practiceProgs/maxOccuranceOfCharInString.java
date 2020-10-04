package practiceProgs;

public class maxOccuranceOfCharInString {
	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {

		int count[] = Array_ASCIIArray.generateASCIIArrayFromString(str);

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		String lowerCaseStr = str.toLowerCase();

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < str.length(); i++) {

			if (lowerCaseStr.charAt(i) >= 97 && lowerCaseStr.charAt(i) <= 102) {

				if (max == count[str.charAt(i)]) {
					if (str.indexOf(str.charAt(i)) < str.indexOf(result))
						result = str.charAt(i);
				} else if (max < count[str.charAt(i)]) {
					max = count[str.charAt(i)];
					result = str.charAt(i);
				}
			}
		}

		return result;
	}

// Driver Method 
	public static void main(String[] args) {
		String str = "bbAaaaAAcc";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}
}
