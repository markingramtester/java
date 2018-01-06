import java.util.ArrayList ;

class Lists
{
	public static void main( String[] args ) //Example code deomonstrating creating an array and replacing one value
	{
		ArrayList<String> list = new ArrayList<String>() ; //Creates new array
		
		list.add( "Alpha" ) ;
		list.add( "Delta" ) ;
		list.add( "Charlie" ) ;
		System.out.println( "List: " + list) ; //Prints default Array values
		
		System.out.println( "Replacing: " + list.get(1) + "\n" ) ; //Picks out 2nd value in Array
		list.set( 1 , "Bravo" ) ;  //Sets 2nd spot in Array with new value
		
		list.forEach((x) -> System.out.println( "Item: " + x)) ;
	}
}
 