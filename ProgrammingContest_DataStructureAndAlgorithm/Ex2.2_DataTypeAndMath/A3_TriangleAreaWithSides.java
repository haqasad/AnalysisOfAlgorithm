// Given the length of sides of a triangle, print its area

import java.util.Scanner;
import java.lang.Math;

class A3TriangleAreaWithSides {
	public static void main(String[] args) {

		double a, b, c, p;
		float area;
		Scanner input = new Scanner(System.in);

		System.out.print("\n\nTriangle sides (a, b, c) with space in between:\t");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		p = (a + b + c)/2;
		area = (float)Math.sqrt(p * (p-a) * (p-b) * (p-c));

		System.out.print("\n\nArea of the triangle: " + area + "\n\n");
		input.close();
	}
}
