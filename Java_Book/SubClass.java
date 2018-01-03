class SubClass extends SuperClass
{
	public static void main( String[] args ) //Example code that has the basic java components
	{
		hello() ;
		SuperClass.hello() ;
		echo( args[0]) ;
	
		try
		{
			echo( args[0]);
		}
		catch(Exception e)
		{
			System.out.println( "Argument required" );
		} 
	}
	
	public static void hello()
	{
		System.out.println("Hello from the Sub Class") ;
	}
}
