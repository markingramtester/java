class Precedence
{
	public static void main ( String[] args ) //program that demonstrates order in which sums will be carried out
	{
		int sum = 32 - 8 + 16 * 2 ; //16 X 2 = 32, + 24 = 56
		System.out.println( "Default order: " + sum) ; 
		
		sum = (32 - 8 + 16) * 2 ; //24 + 16 = 40, X 2 = 80
		System.out.println( "Specified order: " + sum) ;
		
		sum = (32 - (8 + 16)) * 2 ; //32 - 24 = 8, X 2 = 16
		System.out.println( "Specified order: " + sum) ;
	}
}
