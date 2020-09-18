//Nick Fracaro
//Object Oriented Programming
//9/17/2020
//Dr. Klump

//Allows the program to generate a random variable
import java.util.Random;

class CircleCalc
{

    public static void main(String[] args)
    {
    	//introduction
    	System.out.println("Welcome to the Circle area and Circumfrence Calculator");
        //Generates a random number for the radius
    	Random radius = new Random();

    	//Sets the range of the radius from 0 - 50
        int R = radius.nextInt(50);
        
        //outputs the radius
        System.out.println("The given Radius is: " + R);

        //Calcualtions for area and circumfrence
        double Area = Math.round(Math.PI * (R * R));
        double Circumfrence = Math.floor(2 * Math.PI * R);

        //Rounds the area down to lowest whole number
        Math.floor(Area);

        //outputs the circumfrence and area
        System.out.println("The circumfrence is: " + Circumfrence + " sqft");
        System.out.println("The Area is: "+ Area + " sqft");

    }

}
