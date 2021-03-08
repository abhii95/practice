package string;

public class CompareToExample {

	public static void main(String args[]) {
		
		
		/*
		 * The result is a negative integer if this {@code String} object
		 * lexicographically precedes the argument string. The result is a positive
		 * integer if this {@code String} object lexicographically follows the argument
		 * string. The result is zero if the strings are equal
		 */

		String str1 = "abc";
		String str2 = "efg";
		String str3 = "String method tutorial";

		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);

//		int var2 = str1.compareTo(str3);
//		System.out.println("str1 & str3 comparison: " + var2);
//
//		int var3 = str2.compareTo("compareTo method example");
//		System.out.println("str2 & string argument comparison: " + var3);
	}
}