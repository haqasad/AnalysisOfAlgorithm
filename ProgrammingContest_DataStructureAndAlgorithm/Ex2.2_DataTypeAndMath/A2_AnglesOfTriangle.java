// Given the length of sides of a triangle, print the angles

import java.lang.Math;
import java.util.Scanner;

class A2Angle {
	public static void main(String[] args) {
		double a, b, c;
		float A, B, C;
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput sides (a, b, c) with space in between:\t");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		A = (float)((Math.acos((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2))/(2*b*c)))*180/Math.PI);
		B = (float)((Math.acos((Math.pow(c,2) + Math.pow(a,2) - Math.pow(b,2))/(2*c*a)))*180/Math.PI);
		C = (float)((Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2))/(2*a*b)))*180/Math.PI);

		input.close(); 
		System.out.print("\n\nAngle A: " + A + " degrees\n");
		System.out.print("Angle B: " + B + " degrees\n");
		System.out.print("Angle C: " + C + " degrees\n\n");


	}
}
