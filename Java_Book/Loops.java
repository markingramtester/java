class Loops
{
	public static void main( String[] args )
	{
		String[] htm = { "HTML5", "in", "easy", "steps"} ;
		String[] xml = { "XML", "in", "easy", "steps"} ;
		
		int j = 0 ;
		int k = 0 ;
		while ( j < htm.length)
		{
			System.out.println("htm[" +j+ "] is | " + htm[j]) ;
			j++ ;
		}
		if ( xml.length > 0 ) do
		{
			System.out.println( "\t\txml[" +k+ "] is | "+ xml[k] ) ;
			k++ ;
		} while ( k < xml.length) ;
		if (args.length > 0 ) 
		{
			for (int i = 0 ; i < args.length ; i++)
			{
				System.out.println( "args[" +i+ "] is | "+ args[i] ) ;
			}
		}
	}
}