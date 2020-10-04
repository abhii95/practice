package practiceProgs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class PrintUsingBW {

	public static void bufferedWriter(char chaar) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(String.valueOf(chaar));

		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void bufferedWriter(String str) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(str);

		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void bufferedWriter(int str) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(str);

		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void bufferedWriter(int[] intArray) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < intArray.length;)
			bufferedWriter.write(String.valueOf(intArray[i]));

		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void bufferedWriter(char[] charArray) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		bufferedWriter.write(charArray);

		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void bufferedWriter(String[] strArray) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < strArray.length;)
			bufferedWriter.write(strArray[i]);
		bufferedWriter.newLine();
		bufferedWriter.close();

	}

	public static void main(String[] args) throws IOException {

		int[] intarray = { 1, 2, 3, 4, 5, 6 };
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', };
		String[] strArray = { "A", "B", "C", "D", "E", "F", null };
		int inti = 1111;
		String str = "ABBBBCC";

		bufferedWriter(intarray);
		bufferedWriter(charArray);
		bufferedWriter(strArray);
		bufferedWriter(inti);
		bufferedWriter(str);

	}

}
