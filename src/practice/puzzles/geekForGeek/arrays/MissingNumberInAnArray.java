package practice.puzzles.geekForGeek.arrays;

import java.util.Scanner;

public class MissingNumberInAnArray {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfInputs = sc.nextInt();
		int output_arr [] = new int[numberOfInputs];
		for(int i=0;i<numberOfInputs;i++) {
			
			int arraylength = sc.nextInt();
			int sum =0;
			for(int j=0;j<arraylength-1;j++) {
				sum = sum + sc.nextInt();
			}
			int actual_sum = (arraylength * (arraylength + 1))/2;
			output_arr[i] = actual_sum - sum;
		}
		
		for(int i : output_arr) {
			System.out.println(i);
		}
	}
}
