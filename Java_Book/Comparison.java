class Comparison
{
	public static void main ( String[] args ) //Example code to demonstrate comparision statements
	{
		String txt = "Fantastic " ;
		String lang = "Java" ;
		Boolean state = (txt == lang) ; //Assign test result
		System.out.println( "String Equality Test: " + state) ;
		
		state = ( txt != lang) ; //Assign Result
		System.out.println( "String Inequality Test: " + state) ;
		
		int dozen = 12 ;
		int score = 20 ;
		state = (dozen > score) ; //Assign Result
		System.out.println( "Greater Than Test: " + state) ;
		
		state = (dozen < score) ; //Assign Result
		System.out.println( "Less Than Test: " + state) ;
	}
}
