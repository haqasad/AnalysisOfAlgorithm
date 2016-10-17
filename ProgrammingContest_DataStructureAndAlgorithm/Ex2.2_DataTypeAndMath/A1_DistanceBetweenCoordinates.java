// Take input of co-ordinate of two two-dimensional point and print their distance

import java.lang.Math;
import java.util.Scanner;

class A1Distance {
	public static void main(String[] args) {

		double x1, x2, y1, y2;
		float distance;

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput Co-ordinates (x1, y1, x2, y2):\t");

		x1 = input.nextDouble();
		y1 = input.nextDouble();

		x2 = input.nextDouble();
		y2 = input.nextDouble();

		distance = (float)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		System.out.print("\n\nDistance:\t" + distance + "\n\n");
		
		input.close();
	}
}
