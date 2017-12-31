class Condition
{
	public static void main ( String[] args ) //Example code to demonstrate conditional output
	{
		int num1 = 1357 ;
		int num2 = 2468 ;
		
		String result ; 
		
		result = ( num1 % 2 != 0 ) ? "Odd" : "Even" ; //num1 is divided by 2 and there is a remainder. This does not equal to zero so the statement is true.  This returns odd
		System.out.println( num1 + " is " + result ) ; 
		
		result = ( num2 % 2 != 0 ) ? "Odd" : "Even" ;
		System.out.println( num2 + " is " + result ) ;
	}
}
