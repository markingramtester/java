class Dimensions
{
	public static void main( String[] args )
	{
		boolean[][] points = new boolean[5][20]; //Integer has 5 values in first argument and 20 in second
		
		points[0][5] = true;
		points[1][6] = true;
		points[2][7] = true;
		points[3][8] = true;
		points[4][9] = true;
		
		
		for( int i = 0 ; i < points.length ; i++) //uses first argument to do loop 5 times
		{
					for ( int j = 0 ; j < points[0].length ; j++) //uses argumnet 2 to plot a point
		{
			char mark = ( points[i][j] ) ? 'X' : '-' ;
			System.out.print ( mark ) ;
		}

			System.out.print( "\n" ) ;
		}
	}
}
