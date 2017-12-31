class Convert
{
	public static void main( String[] args ) //Example code for converting variable types
	{
		float daysFloat = 365.25f ;
		String weeksString = "52" ;
		
		int daysInt = (int) daysFloat ; //changes floating number to integer
		int weeksInt = Integer.parseInt(weeksString) ;
		
		int week = (daysInt / weeksInt ) ;
		System.out.println( "Days per week: " + week ) ;
	}
}
