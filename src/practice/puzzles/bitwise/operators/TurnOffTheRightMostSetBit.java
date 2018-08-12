package practice.puzzles.bitwise.operators;

import java.util.Scanner;

public class TurnOffTheRightMostSetBit {

	public static void main(String[] args) {
		TurnOffTheRightMostSetBit bit = new TurnOffTheRightMostSetBit();
		
		Scanner sc = new Scanner(System.in);
	     boolean flag = true;
	     
	     while(flag) {
	    	 System.out.println("Enter the number : ");
	    	 int number = sc.nextInt();
	    	 int output = bit.turnOffRightMostSetBit(number);
	    	 System.out.println("Output is : "+output);
	    	 System.out.println("Do you want to continue (Y/N) ?");
	    	 String value  = sc.next();
	    	 if(value.equalsIgnoreCase("y")) {
	    		 flag = true;
	    	 }else {
	    		 flag = false;
	    	 }
	     }
		
	}
	
	private int turnOffRightMostSetBit(int number) {
		
		return number & --number;
	}
}
