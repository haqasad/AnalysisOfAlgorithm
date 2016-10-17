// Given the co-ordinates of a triangle, print area

import java.lang.Math;
import java.util.Scanner;

class A6TriangleArea {
	public static void main(String[] args) {

		double coordinate[] = new double[6];
		double area;

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput co-ordinates (A, B, C)\n\n");

		for(int i=0; i<=5; i++) {

			if(i==0 || i==1) {
				System.out.print("\t\ta" + (i+1) + ":\t");
				coordinate[i] = input.nextDouble();
				System.out.print("\n");
			}

			else if(i==2 || i==3) {
				System.out.print("\t\tb" + (i-1) + ":\t");
				coordinate[i] = input.nextDouble();
				System.out.print("\n");
			}

			else {
				System.out.print("\t\tc" + (i-3) + ":\t");
				coordinate[i] = input.nextDouble();
				System.out.print("\n");
			}
		}

		area = 0.5 * Math.abs((coordinate[0] * (coordinate[3]-coordinate[5])) + (coordinate[2] * (coordinate[5]-coordinate[1])) + (coordinate[4] * (coordinate[1]-coordinate[3])));

		System.out.print("\nArea of triangle:\t" + area + "\n\n");
		input.close();
	}
} 
