class StringSearch
{
	public static void main( String[] args ) //Example code demonstrates searching within strings
	{
		String[] books = 
		{ "Java in easy steps", "XML in easy steps", "HTML in easy steps", "CSS in easy steps", "Gone With the Wind", "Drop the Defense" } ;
		int counter1 = 0, counter2 = 0, counter3 = 0 ;
		for (int i = 0 ; i < books.length ; i++)
		{
			System.out.println( books[i].substring(0,4) + " | "); //displays first word of each string
		if ( books[i].endsWith("in easy steps")) counter1++ ; //Counts how many variables end with "in easy steps"
		if ( books[i].startsWith("Java")) counter2++ ; //Counts how many variables start with "Java"
		if ( books[i].indexOf("easy")==-1) counter3++ ; //Counts how many variables do not include "easy"
		}
		System.out.println("\nFound " + counter1 + " titles from this series");
		System.out.println("\nFound " + counter2 + " Java title");
		System.out.println("\nFound " + counter3 + " other titles");
	}
}
