class Switch
{
	public static void main ( String[] args ) //program switched value of a variable
	{
		int month = 12, year = 2017, num = 31 ;
		
		switch (month) //variable 'month' will be used to perform switch 
		{
			case 4 : case 6 : case 9 : case 11 : num = 30 ; break ; //if month is one of these then num will change to 30
			case 2 : num = (year % 4 == 0) ? 29 : 28 ; break ; //if month is 2 of these then num will change to either 28 or 29, dependant on whether year divides exactly by 4 (leap year)
		}
		
		System.out.println (month+"/"+year+": "+num+"days") ;
	}
}
