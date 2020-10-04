package practiceProgs;

/*For one element product of other elements
 * 
 * input : [2,7,4,1,5]
 * output :[140, 40, 70, 280, 56]
 * 
 * */
public class Array_ProductOfOtherElements {

	static void array(int[] arr) {

		int len = arr.length;
		int[] newArr = new int[len];

		int product = 1;

		for (int i = 0; i < len; i++) {
			product = product * arr[i];
		}

		for (int i = 0; i < len; i++) {

			newArr[i] = product / arr[i];
			System.out.print(newArr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { -2, 7, -5, 1, -1 };

		array(arr);

	}

}
