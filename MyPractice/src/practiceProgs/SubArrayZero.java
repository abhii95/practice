package practiceProgs;

import java.util.HashMap;

public class SubArrayZero {
	
	public static void main(String[] args) {
		
	}

	
	static void subArrayZero() {/*

			// Cumulative sum technique for sub arrays sum
			// {a,b,c,d,e,f,g,h}
			// {a, a+b, a+b+c,a+b+c+d,a+b+c+d+e,a+b+c+d+e+f,a+b+c+d+e+f+g,a+b+c+d+e+f+g+h,}
			// {4,3,7,0,-7}

			// subarray - cumulative sum

			int[] arr = { 4, 3, 7, 0, -7 };
			// { 4, 7, 14, 14, 7 }

			int sum = 0;
			int count = 0;

			HashMap<Integer, Integer> hmap = new HashMap<>();

			for (int i = 0; i < arr.length; i++) {

				sum = sum + arr[i];

				if (hmap.containsKey(sum - k)) {
					count = count + hmap.get(sum - k);
				}

				hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);

			}
		*/}
	}
