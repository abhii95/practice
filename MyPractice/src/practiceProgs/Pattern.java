package practiceProgs;

public class Pattern {

	// https://www.baeldung.com/java-printstream-printf

	// %[flags][width][.precision]conversion-character

	// s – formats strings
	// d – formats decimal integers
	// f – formats the floating-point numbers
	// t – formats date/time values

	// To break the string into separate lines, we have a %n specifier
	// To format boolean values, we use the %b format
	// To format a simple string, we'll use the %s combination
	// The result of %c is a Unicode character:

	// %n -> new lines
	// %b -> boolean values
	// %s -> string
	// %{+totalLengththOfString}%s - if string size is less than legth will appended
	// with spaces
	// %{-totalLengththOfString}%s
	// %c -> character
	// %f -> float
	// %{totalLengthOfNumber}.{lengthOfDecimalPart}%f -> float with precision

	static void printUpStairCase(int noOfRows) {

		// 1)
		//     *
		//    **
		//   ***
		//  **** 
		// ***** 

		String c = "*";
		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + noOfRows + "s\n", c);
			c = c + "*";
		}
	}
	
	
	static void printDownStairCase(int noOfRows) {
		
		// 2)
				// *
				// **
				// ***
				// ****
				// *****
		
		String c = "*";
		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%-" + noOfRows + "s\n", c);
			c = c + "*";
		}

	}
	

	static void printPyramid(int noOfRows) {
		
		// 2)
				//    *
				//   * *
				//  * * *
				// * * * *
				//* * * * *
		
		String c = "*";
		int noOfCharsperLine = noOfRows;
		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + noOfCharsperLine + "s\n", c);
			c = c + " *";
			noOfCharsperLine++;
		}

	}
	
	static void printPyramid2(int noOfRows) {
		
		// 2)
				//    *
				//   ***
				//  *****
				// *******
				//*********
		
		String c = "*";
		int noOfCharsperLine = noOfRows;
		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + noOfCharsperLine + "s\n", c);
			c = c + "**";
			noOfCharsperLine++;
		}

	}
	
	static void printRhombus(int noOfRows) {
		
		// 2)
				//    *
				//   ***
				//  *****
				// *******
				//*********
		
		String c = "*";
		int noOfCharsperLine = noOfRows;

		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + noOfCharsperLine + "s\n", c);
			c = c + "**";
			noOfCharsperLine++;
		}

		int count = c.length()-1;
		for (int i = 1; i < noOfRows; i++) {

			count = count - 2;
			noOfCharsperLine = noOfCharsperLine - 1;
			//System.out.println(noOfCharsperLine);
			String str = c.substring(0, count);
			System.out.printf("%" + noOfCharsperLine + "s\n", str);
		}

	}
	
	
	
	

	public static void main(String[] args) {
		int row = 5;
		printRhombus(row);
	}

}
