package practiceProgs;

public class Array_RotateArray {

	static int[] rotateArrayRIGHTbyN(int[] arr, int noOfRotations, String direction) {

		int length = arr.length;
		noOfRotations = noOfRotations % length;

		// If left
		if (direction.equalsIgnoreCase("left"))
			noOfRotations = length - noOfRotations;

		int[] rotated_arr = new int[length];

		/*
		 * 0 1 2 3 4 5 6 7 {2, 0,-1, 4 ,2 ,-6 ,3 ,0} => rot = 2 i =0 ; r_index = 2 ;
		 * rotated_array[2] = -1; i =1 ; r_index = 3 ; rotated_array[3] = 4; i =5 ;
		 * r_index = 7 ; rotated_array[1] = 5; i =6 ; r_index = 8 ; rotated_array[2] =
		 * 0;
		 * 
		 */

		for (int i = 0; i < length; i++) {

			int r_index = (i + noOfRotations) % length;

			rotated_arr[r_index] = arr[i];

		}

		return rotated_arr;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int no_of_rotations = 2;

		for (int i : rotateArrayRIGHTbyN(arr, no_of_rotations, "right")) {

			System.out.print(i + " ");

		}

	}

}
