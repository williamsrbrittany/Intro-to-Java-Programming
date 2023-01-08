/* This program will request the size of the sides of the triangle and determine the area and perimeter.
 * It will also ask if the user wants a fill color. If no fill color is designated it will display that the triangle will not be solid.
 * 
 */

import java.util.Scanner;

public class Chapter11Lab1 {

	public static void main(String[] args) {
		// declare the variable, Scanner object and set repeat to yes
		Scanner input = new Scanner(System.in);
		double[] sides = new double[3];
		String color;
		boolean filled = false;
		String repeat = "yes";
	}
	
	//create a do/while loop that will run as long as repeat equals yes do

{
		System.out.print("Enter three sides: ");
		for(int i=0; i<sides.length; i++)
		{
			sides[i] = input.nextDouble();
		}
		System.out.println("Enter the color: ");
		color = input.next();
		
		Triangle triangle = new Triangle(sides[0], sides[1], sides[2], color);
		
		System.out.println("Enter true if you want to fill the triangle with color: " +
		color+". \nIf you do not want to fill the triangle with color please enter false.");
		
		filled = input.nextBoolean();
		if(filled == false)
		{
			color = "No color";
			triangle.setColor(color);
		}
		
		triangle.setFilled(filled);
		
		System.out.println();
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
		System.out.println("The color is " + triangle.getColor());
		System.out.println(triangle);
		System.out.println();
		
		System.out.println("Do you wish to enter new values? Please enter yes/no");
		repeat = input.next();	
 }
		while(repeat.equalsIgnoreCase("yes"));
		
	}
	

}
