// Given the radius of a circle, print its perimeter

import java.lang.Math;
import java.util.Scanner;

class A4CirclePerimeter {
	public static void main(String[] args) {

		double radius;
		float perimeter;

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput radius:\t");
		radius = input.nextDouble();

		perimeter = (float)(2 * Math.PI * radius);
		
		System.out.print("\n\nCircle perimeter:\t" + perimeter + "\n\n");
		input.close();
	}
}
