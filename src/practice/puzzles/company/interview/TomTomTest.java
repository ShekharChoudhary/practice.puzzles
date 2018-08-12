package practice.puzzles.company.interview;

import java.util.Scanner;
import java.util.TreeSet;

public class TomTomTest {
	public static void main(String[] args) {
		TomTomTest test = new TomTomTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int arrayLength = sc.nextInt();
		int a[] = new int[arrayLength];
		System.out.println("Enter the array");
		for (int x = 0; x < arrayLength; x++) {
			a[x] = sc.nextInt();
		}
		System.out.println(test.checkPair(a));
	}

	private int checkPair(int[] a) {
		TreeSet<Integer> set = new TreeSet<>();
		int length = 1;
		int largestLength = 0;
		for (int j = 0; j < a.length - 1; j++) {
			if (largestLength < length) {
				largestLength = length;
			}
			if (!set.isEmpty()) {
				set.clear();
			}
			boolean flag = true;
			int count = 1, i = j + 1;
			boolean dualCheck = set.add(a[j]);
			length = 1;
			while (flag && i < a.length) {
				dualCheck = set.add(a[i]);
				if (dualCheck && count <= 2) {
					i++;
					count++;
					if (count <= 2) {
						length++;
					} else {
						flag = false;
					}
				} else {
					length++;
					i++;
				}
			}
		}
		return largestLength;
	}
}
