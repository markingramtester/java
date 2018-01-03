class SuperClass
{
	public static void hello( ) //Example code that has the basic java components
	{
		System.out.println("Hello from the Super Class") ;
	}
	
	public static void echo( String arg)
	{
		try
		{ System.out.println("You entered: " + arg) ; }
		catch (Exception e )
		{ System.out.println("Argument required") ; }
	}
}
