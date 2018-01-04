import java.io.* ;

class WriteFile
{
	public static void main( String[] args ) //Example code demonstrating writing data to a file
	{
		try
		{
			FileWriter file = new FileWriter ("tam.txt") ; //wil output to a file called 'tam.txt'
			
			BufferedWriter buffer = new BufferedWriter( file ) ; //buffer will determine what goes into file
			
			buffer.write("The wind blew as if it had blown its last") ; //first line etc
				buffer.newLine(); //new line command
			buffer.write("The rattling showers rose on its blast") ;
				buffer.newLine();
			buffer.write("The speedy gleams the darkness swallowed") ;
				buffer.newLine();
			buffer.write("Loud, deep and long the thunder bellowed") ;
				buffer.newLine();
			buffer.write("That night a child might understand") ;
				buffer.newLine();
			buffer.write("The devil had business on his hand.") ;
			
			buffer.close() ; //closes off writing of file	
			
		}
		catch ( IOException e )
		{
			System.out.println("A write error has occurred") ;
		}
	}
}