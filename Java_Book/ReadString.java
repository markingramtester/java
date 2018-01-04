import java.io.* ;

class ReadString
{
	public static void main( String[] args ) //Example code demonstrating reading input from command line
	{
		System.out.println("Enter the title of this book: "); //Basic output message
		InputStreamReader isr = new InputStreamReader( System.in ) ; //reads input from command line
		BufferedReader buffer = new BufferedReader( isr ) ; //reads the decoded input
		String input = "" ; //input is stored here
		
		try
		{
			input = buffer.readLine() ;
			buffer.close() ;
		}
		catch ( IOException e )
		{
			System.out.println("An input error has occurred") ;
		}
		System.out.println( "\nThanks, you are reading " + input) ;
	}
}