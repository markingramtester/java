class StringComparison
{
	public static void main( String[] args ) //Example code demonstrating comparing Strings
	{
		String password = "bingo" ;
		try 
		{
			if (args[0].toLowerCase().equals( password )) //converts argumnt to lower case then compares to stored password
		{
			System.out.println( "Password accepted.") ; //If password does match this will be returned
		}
		else 
		{
			System.out.println( "Incorrect password.") ; //If password does not match this will be returned
		}

		}
		catch ( Exception e )
		{
			System.out.println( "Password required."); //If no command line argument this will be returned
		}
	}
}
