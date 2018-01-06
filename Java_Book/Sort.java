import java.util.Arrays ;

class Sort
{
	public static void main( String[] args ) //Example code demonstrating sorting array elements
	{
		String[] names = { "Mike","Dave","Andy" } ;
		int[] nums = {200,300,100} ;
		
		display ( names ) ; //displays variables in default order
		display ( nums ) ;
		
		Arrays.sort( names ) ; //calls array to sort variables
		Arrays.sort( nums ) ;
		
		display ( names ) ;
		display ( nums ) ;
	}
	
	public static void display( String [] elems )
	{
		System.out.println( "\nString Array:" ) ;
		for ( int i = 0 ; i < elems.length ; i++)
		System.out.println( "Element "+i+" is "+elems[i]) ;
	}
	
	public static void display( int [] elems )
	{
		System.out.println( "\nInteger Array:" ) ;
		for ( int i = 0 ; i < elems.length ; i++)
		System.out.println( "Element "+i+" is "+elems[i]) ;
	}	
}
 