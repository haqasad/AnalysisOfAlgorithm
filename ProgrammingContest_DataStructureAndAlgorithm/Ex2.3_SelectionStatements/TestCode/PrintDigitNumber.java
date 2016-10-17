// Print the number of digits in a given number

import java.util.Scanner;
import java.lang.Math;

class PrintDigitNumber {
	public static void main(String[] args) {	
		System.out.print("\n\nInput integer:\t");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double x = 1;

		while(x > 0) {
			if((a/Math.pow(10,x)) >= 0.1 && (a/Math.pow(10,x)) < 1) {
				System.out.print("\nDigit in number:\t" + x + "\n\n");
				break;
			}
		x++;
		}
	}
}
