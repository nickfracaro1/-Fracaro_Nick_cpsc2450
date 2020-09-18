//Nick Fracaro
//Object Oriented Programming
//9/18/2020
//Dr. Klump

import java.util.Scanner;

public class Flooring
{
	
	public static void main(String[] args)
	{
		//Declares room length and width as integers so the scanner can use them
		int roomLength;
		int roomWidth;
		
		//Cost of the boards
		double cost = 24.99;
		
		//Introductory message
		System.out.println("Welcome to Floorcoverings Calculator");
		System.out.println("1 Package of Boards: $24.00");
		System.out.println("Each package comes in pieces of 6 and each board is 30in length by 6in width");
		System.out.println("Please enter the length and width of the room in ft");
		
		//Takes user input for length of the room
		Scanner length = new Scanner(System.in);
		System.out.println("Length: ");
		
		roomLength = length.nextInt();
		
		//Takes user input for the width of the room
		Scanner width = new Scanner(System.in);
		System.out.println("Width: ");
		
		roomWidth = width.nextInt();
		
		//generates the area of the room
		double floorArea = roomLength*roomWidth;
		
		System.out.println(floorArea + "ft");
		
		//Multiples the room by 12 to account for slant in the room
		double boardArea = floorArea * 12;
		
		//Divides the area of the room by the area of the boards
		double boardArea2 = boardArea / 180;
		
		//Accounts for 20% waste because of having to cut the boards
		double waste = boardArea2 * .20;
		
		//Adding the 20% aste to the area of the room and boards
		double finalMeasurement = boardArea2 + waste;
		
		//Generates the overall cost by taking the cost of each package and the measurement of the boardsarea
		double finalCost = finalMeasurement * cost;
		
		//outputs final meausrments and costs
		System.out.println("You need to purchase " + finalMeasurement +" packages" );
		System.out.println("Which comes out to $" + finalCost);
	}
	

}
