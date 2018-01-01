class StringLength
{
	public static void main( String[] args ) //Example code demonstrating managing strings
	{
		String lang = "Java" ;
		String series = " in easy Steps" ;
		String title = lang.concat( series ) ; //adds both strings together into a new variable 
		
		System.out.println( "\"" + title + "\" has " ) ;
		System.out.println( title.length() + " characters") ;
	}
}
