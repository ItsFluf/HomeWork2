package Task3;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// mileage זה קילומטאז' של המכונית
		System.out.println("This program will take the price of gas, the length of the Road, and the car mileage per liter of gas ad output how much the gas will cost for this trip.");
		System.out.println("Give me the price of gas: ");
		float GasPrice = reader.nextFloat();
		System.out.println("Give me the price of length of the Road: ");
		float LengthOfRoad = reader.nextFloat();
		System.out.println("Give me the Milage per liter of gas of the car: ");
		float MileagePerLiter = reader.nextFloat();
		float GasTotalCost = (LengthOfRoad / MileagePerLiter) * GasPrice;
		System.out.println("The total cost of the gas for this trip will be " + GasTotalCost + " shekels.");
	}
}
