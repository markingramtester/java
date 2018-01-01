class Lottery
{
	public static void main( String[] args ) //Example code demonstrating generating 6 random whole numbers between 1 & 49
	{
		int[] nums = new int[50]; //New variable with 50 values
		for ( int i = 1; i < 50 ; i++) {nums[i] = i ; } //Assign values 1-49 to variable
		for ( int i = 1; i < 50 ; i++)
		{
			int r = (int) Math.ceil(Math.random() * 49) ;
			int temp = nums[i] ;
			nums[i] = nums[r] ;
			nums[r] = temp ; //Random order for the values
		}
		for ( int i = 1 ; i < 7 ; i++)
		{
			System.out.println( Integer.toString( nums[i]) + " ") ; //Outputs only the first 6 values
		}
	}
}
