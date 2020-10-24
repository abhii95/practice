package practiceProgs;

public class Patterns {

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

			
			//System.out.printf("%" + noOfRows + "s\n", c);
			System.out.printf("%" + ((noOfRows - i) > 0 ? (noOfRows - i) : "") + "s", "");
			System.out.print(c+"\n");
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
		
		// 3)
				//    *
				//   * *
				//  * * *
				// * * * *
				//* * * * *
		
		String c = "*";
		//int noOfCharsperLine = noOfRows;
		for (int i = 1; i <= noOfRows; i++) {
			
			
			System.out.printf("%" + ((noOfRows - i) > 0 ? (noOfRows - i) : "") + "s", "");
			System.out.print(c+"\n");

			//System.out.printf("%" + noOfCharsperLine + "s\n", c);
			  c = c + " *";
			//noOfCharsperLine++;
		}

	}
	
	static void printPyramid2(int noOfRows) {
		
		// 4)
				//    *
				//   ***
				//  *****
				// *******
				//*********
		
		String c = "*";
		//int noOfCharsperLine = noOfRows;
		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + ((noOfRows - i) > 0 ? (noOfRows - i) : "") + "s", "");
			System.out.print(c+"\n");
			
			//System.out.printf("%" + noOfCharsperLine + "s\n", c);
			c = c + "**";
			//noOfCharsperLine++;
		}

	}
	
	static void printRhombus(int noOfRows) {

		// 5)
//       *
//      ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *

		String c = "*";
		int noOfCharsperLine = noOfRows;

		for (int i = 1; i <= noOfRows; i++) {

			System.out.printf("%" + noOfCharsperLine + "s\n", c);
			c = c + "**";
			noOfCharsperLine++;
		}

		String str = c.substring(0, c.length() - 2);
		noOfCharsperLine = noOfCharsperLine - 1;

		for (int i = 1; i < noOfRows; i++) {

			str = str.substring(0, str.length() - 2);
			noOfCharsperLine--;
			System.out.printf("%" + noOfCharsperLine + "s\n", str);

		}

	}
	
	static void printNPattern(int noOfRows) {
		
	//	   1
	//    1 2
	//   1 2 3
	//  1 2 3 4
	// 1 2 3 4 5
		
	String str = "";
	for (int i = 1; i <= noOfRows; i++) {

		str = str + i + " ";
		System.out.printf("%" + ((noOfRows - i) > 0 ? (noOfRows - i) : "") + "s", "");
		System.out.print(str);
		System.out.println();
	}
}
	
	

	public static void main(String[] args) {
		int row = 5;
		printUpStairCase(row);
	}

}
