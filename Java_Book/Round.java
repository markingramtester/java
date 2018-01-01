class Round
{
	public static void main( String[] args ) //Example code that demonstrates rounding figures
	{
		float num = 7.25f ;
		
		System.out.println( num+" rounded is "+Math.round( num )) ; //Rounds number to nearest number
		System.out.println( num+" floored is "+Math.floor( num )) ; //Rounds number down
		System.out.println( num+" ceiling is "+Math.ceil( num )) ; //Rounds number up
	}
}
