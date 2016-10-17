// Palindrome is a symmetric word or number which reads identical when read right to left or left to right. Example, 1, 2, 3, ..., 9, 11, 22, 33, ..., 99, 101, 111, 121, ... Find out the nth palindrome (n<100)

import java.util.Scanner;
import java.lang.Math;

class A1Palindrome {
	public static void main(String[] args) {

		int countPalindrome = 0;
		int countIndex = 1;
		int arrayLength = 0;
		int num[];
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput n:\t");
		int n = input.nextInt();
		
		if(n==0) {
			System.out.print("\nINVALID INPUT: input must be greater than 0\n\n");
		}
		else {
			while(countIndex > 0) {

				double x = 1;
				while(x > 0) {
					if((countIndex/Math.pow(10,x)) >= 0.1 && (countIndex/Math.pow(10,x)) < 1) {
						arrayLength = (int)x;
						break;
					}
				x++;
				}

				if(arrayLength == 1) {
					countPalindrome++;
					if(countPalindrome == n) {
						System.out.print("\nnth palindrome:\t" + countPalindrome + "\n\n"); 
						break;
					}
					else
						countIndex++;
				}
				else {
					num = new int[arrayLength];
					int a = countIndex;
					int aprime = 0;

						for(int i=0; i<(arrayLength-1); i++) {
							int b = (int)Math.pow(10,(arrayLength - (i+1)));
							num[i] = a/b;
							a -= num[i]*b;
						}

						for(int i=0; i<= (arrayLength-1); i++) {
							int b = (int)Math.pow(10,i);
							aprime += num[i]*b;
						}

						if((a - aprime) == 0) {
							countPalindrome++;

							if(countPalindrome == n) {
								System.out.print("\nnth palindrome:\t" + countIndex + "\n\n");
								break;
							}
							else
								countIndex++;
						}
						else
							countIndex++;
				}
			}			
		}
		input.close();
	}
}
