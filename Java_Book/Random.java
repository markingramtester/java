class Random
{
	public static void main( String[] args ) //Example code demonstrating generating a random number
	{
		float random = (float) Math.random() ;
		System.out.println("Random Number: " + random) ; //Generates a random number between 0 and o.999
		
		float multiplied = random * 10 ;
		System.out.println("Multiplied Number: " + multiplied) ; //Multiplies the random number by 10
		
		float randomint = (int) Math.ceil( multiplied) ;
		System.out.println("Random Integer: " + randomint) ; //Rounds random multiplied value up
	}
}
