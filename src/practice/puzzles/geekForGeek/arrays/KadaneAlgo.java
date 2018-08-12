package practice.puzzles.geekForGeek.arrays;

import java.util.Scanner;

public class KadaneAlgo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int output_arr[] = new int[n];
		for (int j = 0; j < n; j++) {
			int x = s.nextInt();
			int arr[] = new int[x];
			for (int i = 0; i < x; i++) {// for reading array
				arr[i] = s.nextInt();
			}

			output_arr[j] = maxSubArraySum(arr);

		}

		for (int i : output_arr) { // for printing array

			System.out.println(i);

		}

	}

	static int maxSubArraySum(int a[]) {
		int max_end = 0, max_so_far = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			max_end = max_end + a[i];
			if (max_so_far < max_end) {
				max_so_far = max_end;
			}
			if (max_end < 0) {
				max_end = 0;
			}

		}

		return max_so_far;
	}
}