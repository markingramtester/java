import java.io.* ;

class ListFiles
{
	public static void main( String[] args ) //Example code demonstrating looking in a folder
	{
		File dir = new File ( "data" ) ; //Creates file object for folder called 'data'
		
		if ( dir.exists())
		{
			String[] files = dir.list() ; //returns number of files and then a list of file names
			System.out.println( files.length + " files found...");
			for (int i = 0 ; i < files.length ; i++)
			{
				System.out.println( files[i]);
			}
		}
		else
		{	System.out.println( "Folder not found.") ;   } //if no data folder, return this
	}
}
 