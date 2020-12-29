package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileToString {
	public static void main(String[] args) {
		String filePath = "src/data.txt";

		System.out.println(usingBufferedReader(filePath));
	}

	// Read file content into the string with - using BufferedReader and FileReader
	// You can use this if you are still not using Java 8

	private static String usingBufferedReader(String filePath) {

		StringBuilder contentBuilder = new StringBuilder();

		try {

			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while (br.readLine() != null) {
				contentBuilder.append(br.readLine()).append("\n");
			}

			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

//		finally {
//			br.close();
//		}

		return contentBuilder.toString();
	}
}