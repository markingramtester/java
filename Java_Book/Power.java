class Power
{
	public static void main( String[] args ) //Example code demonstrates power and sqaure root functions
	{
		int num = Integer.parseInt( args[0]) ; //ets integer from command line
		int square = (int) Math.pow( num, 2) ; 
		int cube = (int) Math.pow( num, 3) ;
		int sqrt = (int) Math.sqrt( num) ;
		
		System.out.println( num + " squared is " + square ) ; //calculates the square of a number
		System.out.println( num + " cubed is " + cube ) ; //calculates the cube of a number
		System.out.println( "Square root of " +  num + " is " + sqrt ) ; //calculates the square root of a number
	}
}
