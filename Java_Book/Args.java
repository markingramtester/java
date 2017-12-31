class Args
{
	public static void main( String[] args )
	{
		if(args.length != 3) //perform code if there are NOT 3 arguments
		{
			System.out.println( "Wrong number of arguments" ) ;  //text if NOT 3 arguments
			return ;
		}
		int num1 = Integer.parseInt( args[0]) ; //first argument to be a number
		int num2 = Integer.parseInt( args[2]) ; //third argument to be a number
		String msg = args[0] + args[1] + args[2] + "=" ;
		
		if ( args[1].equals("+"))		msg += (num1 + num2); //if arg 2 is a plus sign
		else if ( args[1].equals("-"))	msg += (num1 - num2); //if arg 2 is a minus sign
		else if ( args[1].equals("X"))	msg += (num1 * num2); //if arg 2 is a multiplication sign
		else if ( args[1].equals("/"))	msg += (num1 / num2); //if arg 2 is a divide sign
		else msg = "Incorrect operator" ; //run this code if arguments do not fit into previous code
		
		System.out.println( msg ) ; //display message String
	}
}
