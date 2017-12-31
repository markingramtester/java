class Loops
{
	public static void main( String[] args ) //program demonstrates three types of loops
	{
		String[] htm = { "HTML5", "in", "easy", "steps"} ;
		String[] xml = { "XML", "in", "easy", "steps"} ;
		
		int j = 0 ;
		int k = 0 ;
		while ( j < htm.length) //this one goes through until j reaches length of htm (4)
		{
			System.out.println("htm[" +j+ "] is | " + htm[j]) ;
			j++ ;
		}
		if ( xml.length > 0 ) do //this one goes through as long as k is less then the length of xml (4)
		{
			System.out.println( "\t\txml[" +k+ "] is | "+ xml[k] ) ;
			k++ ;
		} while ( k < xml.length) ;
		if (args.length > 0 ) //this uses input arguments and runs until each argument has been used
		{
			for (int i = 0 ; i < args.length ; i++)
			{
				System.out.println( "args[" +i+ "] is | "+ args[i] ) ;
			}
		}
	}
}
