package practice.puzzles.geekForGeek.arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCaseNumber = sc.nextInt();
		int sizeOfTheArray = 0;
		int sum = 0;
		int[] arr;
		int[][] outputArray = new int[testCaseNumber][2];
		for (int j = 0; j < testCaseNumber; j++) {
			sizeOfTheArray = sc.nextInt();
			sum = sc.nextInt();

			arr = new int[sizeOfTheArray];
			for (int k = 0; k < sizeOfTheArray; k++) {
				arr[k] = sc.nextInt();
			}

			outputArray[j] = new SubArrayWithGivenSum().subArrayPositionWithGivenSum(arr, sum);

		}
		boolean outputStatus = true;
		for (int[] x : outputArray) {
			for (int i : x) {
				if(i==-1 && outputStatus) {
					System.out.print(i);
					outputStatus = false;
				}
				if(outputStatus) {
				System.out.print(i + " ");
				}
				
			}
			System.out.println();
			outputStatus = true;
		}

	}

	public int[] subArrayPositionWithGivenSum(int[] arr, int sum) {

		boolean flag = false;
		int[] positionArray = new int[2];
		int counterPosition = 0;
		int sumstartPosition = 0;
		int totalSum = 0;
		while (true && counterPosition < arr.length) {
			totalSum = totalSum + arr[counterPosition];

			if (totalSum > sum) {
				counterPosition = ++sumstartPosition;
				totalSum = 0;
			} else if (totalSum == sum) {
				counterPosition++;
				sumstartPosition++;
				flag = true;
				break;
			} else {

				counterPosition++;
			}
		}
		if (flag) {
			positionArray[0] = sumstartPosition;
			positionArray[1] = counterPosition;
		}else {
			positionArray[0] = -1;
			positionArray[1] = -1;
		}
		return positionArray;
	}
}