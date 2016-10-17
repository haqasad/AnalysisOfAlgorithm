// Prints palindrome of given integer

import java.util.Scanner;
import java.lang.Math;

class PrintPalindrome {
	public static void main(String[] args) {
		int num[] = new int[5];
		int aprime = 0;
		System.out.print("\nInput integer of 5 digits:\t");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		for(int i=0; i<=4; i++) {
			int b = (int)Math.pow(10,(5 - (i+1)));
			num[i] = a/b;
			a -= num[i]*b;
		}

		for(int i=0; i<=4; i++) {
			int b = (int)Math.pow(10,i);
			aprime += num[i]*b;
		}

		System.out.print("\n" + aprime + "\n");
	}
}
