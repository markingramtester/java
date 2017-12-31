class Break
{
	public static void main ( String[] args ) //Example code for a Break and Continue in a for loop
	{
		for (int i = 1 ; i < 4 ; i++)
		{
			for (int j = 1 ; j < 4 ; j++)
			{
				if ( i == 1 && j == 1)
				{
					System.out.println("Continues innerLoop when i="+i+" j="+j) ;
					continue ;
				}
				if ( i == 2 && j == 1)
				{
					System.out.println("Breaks innerLoop when i="+i+" j="+j) ;
					break ; //when i = 1 and j also = 1 this if stement will stop
				}
				System.out.println( "Running i="+i+" j="+j );
			}
		}
	}
}
