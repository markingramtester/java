class Assignment
{
	public static void main ( String[] args )
	{
		String txt = "Fantastic " ;
		String lang = "java" ;
		txt += lang ; //Assign concatenated string 
		System.out.println( "Add & Assign Strings: " + txt) ;
		
		int sum = 10 ;
		int num = 20 ;
		sum += num ; //Assign result ( 10 + 20 = 20 )
		System.out.println( "Add & Assign Integers: " + sum) ;
		
		int factor = 5 ;
		sum *= factor ; //Assign result ( 30 X 5 = 150 )
		System.out.println( "Multiplication Sum: " + sum) ;
		
		sum /= factor ; //Assign result ( 150 / 5 = 30 )
		System.out.println( "Division Sum: " + sum) ;
	}
}