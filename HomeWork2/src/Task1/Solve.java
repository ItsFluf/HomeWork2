package Task1;

import java.util.*;
import java.math.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("This Program will take the diameters of a rectangle \nand will calculate the perimeter, the area and the diagonal of the rectangle");
		
		System.out.println("Please give me the length of the rectangle: ");
		// this name expresses what this variable stores inside of it
		float length = reader.nextFloat();
		
		System.out.println("Please give me the width of the rectangle: ");
		// this name expresses what this variable stores inside of it
		float width = reader.nextFloat();
		
		/* this is the formula to calculate a perimeter of any shape by adding put all of the side,
		 but because a rectangle has 2 pairs of identical sides, we can simple multiply them */
		float perimeter = (float)(Math.round(((length * 2) + (width * 2))));
		
		// this is the formula to calculate the area of a shape from the family of squares, length * width  
		float area = (float)(Math.round(length * width));
		
		// uses the pythagorean theorem, which is: a^2 + b^2 = c^2/ or the revers of it: c = square_root(a^2 + b^2)
		float diagonal = (float) Math.sqrt((Math.pow(length, 2) + (Math.pow(width, 2))));
		
		
		//prints the results of the calculations
		System.out.printf("the perimeter of the rectangle is %.1f which comes from the addition of the multiplication of the length which is %.1f time 2 and the multiplication of the width which is %.1f times 2.\n", perimeter , length, width);
		System.out.println(" ");
		System.out.printf("the area of the rectangle is %.1f which comes from the multiplication of the length which is %.1f and the width which is %.1f.\n", area , length, width);
		System.out.println(" ");
		System.out.printf("the diagonal of the rectangle is %.1f which comes from the square root of the length which is %.1f to the power of 2 and the width which is %.1f to the power of 2.\n", diagonal, length, width);
	}
}
