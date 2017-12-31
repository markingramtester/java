class Pi
{
	public static void main( String[] args ) //Example code to demonstrate using Pi in maths
	{
		float radius = Float.parseFloat( args[0]) ; //radius equals input from command line
		float shortPi = (float) Math.PI ; //store Pi as a float number (with decimal points)
		
		float circ = shortPi * (radius + radius ) ; //circ equals the sum stated
		float area = shortPi * (radius * radius ) ; //area equals the sum stated
		
		System.out.println("With Pi commuted from " + Math.PI ) ; //Standard Pi in java
		System.out.println("to " + shortPi + "..." ) ; //new short pi int
		System.out.println("A circle of radius " + radius + " cm" ) ; //input from command line 
		System.out.println("has a circumference of " + circ + " cm" ) ; //circumference of circle
		System.out.println("and an area of " + area + " cm" ) ; //area of circle
	}
}
