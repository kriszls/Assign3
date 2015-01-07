// Assignment 3 Circle Calculation Applet
// A  Java Applet that prompts the user to enter the radius of a circle,
// then displays its diameter, circumference, and area.

import java.awt.Graphics; 
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Assign3 extends JApplet 
{
	private double radius; // radius entered by user
	
	// initialise applet by obtaining radius from user
	public void init()
	{
		// obtain radius from user
		String radiusString = JOptionPane.showInputDialog(
				"Enter the radius of the circle");
		
		// convert radius from type String to type double
		
		double radius = Double.parseDouble( radiusString );
		
		// calculate diameter
		
		double diameter = radius * 2;
				
		// calculate circumference 
				
		double circumference = diameter * Math.PI;
		
		// calculate area
		
		double area = radius * radius * Math.PI;
		
		
		}

	// shows results of radius, diamter, circumference, area in a Java applet
	public void paint ( Graphics g )
	{
		super.paint ( g ); // call superclass version of method paint
		
		// draw results as a String at specified x co-ordinate, y co-ordinate
		
		g.drawString( "The radius is " + radius, 25, 25);
		g.drawString( "The diameter is " + diameter, 26, 26);
		g.drawString( "The circumference is " + circumference, 27, 27);
		g.drawString( "The area is " + area, 28, 28);
		
		// end method paint
	}
}