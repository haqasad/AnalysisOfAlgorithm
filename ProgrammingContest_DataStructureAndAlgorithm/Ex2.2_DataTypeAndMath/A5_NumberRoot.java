// Print the nearest integer of the root of a given number

import java.lang.Math;
import java.util.Scanner;

class A5NumberRoot {
	public static void main(String[] args) {

		double x,y;
//		int y;

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput number:\t");
		x = input.nextDouble();

		y = Math.sqrt(x);
		
		System.out.print("\n\nNearest integer (greater) of root of " + x + " is " +  Math.ceil(y));
		System.out.print("\nNearest integer (lesser) of root of " + x + " is " +  Math.floor(y) + "\n\n");

		input.close();
	}
}

