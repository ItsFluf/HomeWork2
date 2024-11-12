package Task2;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("This program will take the mesurments of a chest and output the areas of the front and back, the top and the bottom and the sides(left and right)");
		System.out.println("give me the length of the chest: ");
		float length = reader.nextFloat();
		System.out.println("give me the width of the chest: ");
		float width = reader.nextFloat();
		System.out.println("give me the depth of the chest: ");
		float depth = reader.nextFloat();
		int LandR = (int)(depth * width);
		int FandB = (int)(length * width);
		int TandB = (int)(depth * length);
		int ChestVolume = (int)(depth * length * width);
		System.out.println("The area of the front and back sides of the chest is: " + FandB);
		System.out.println("The area of the left and right sides of the chest is: " + LandR);
		System.out.println("The area of the top and bottom sides of the chest is: " + TandB);
		System.out.println("The Volume of the chest is: " + ChestVolume + "cc.");
		int ChestSurfaceArea = (int)(2*(depth * width + depth * length + length * width));
		int CoverChest = ChestSurfaceArea * 30;
		System.out.println("If we cover the hole chest with aluminum foil that cost 30 shekels per cubic meter, it will cost " + CoverChest + " shekels.");
	}
}
