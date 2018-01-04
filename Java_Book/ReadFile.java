import java.io.* ;

class ReadFile
{
	public static void main( String[] args ) //Example code demonstrating reading data from a file
	{
		try
		{
			FileReader file = new FileReader ("oscar.txt") ; //puts 'oscar.txt' file into file
			
			BufferedReader buffer = new BufferedReader( file ) ; //file is beng read
			
			String line = "" ;
			
			while ((line = buffer.readLine())!= null ) //while the file has non null lines
			{
				System.out.println( line) ;	 //output line variable
			}
			
			buffer.close() ;
		}
		catch ( IOException e )
		{
			System.out.println("A read error has occurred") ;
		}
	}
}