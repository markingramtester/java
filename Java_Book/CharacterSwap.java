class CharacterSwap
{
	public static void main( String[] args ) //Example code demonstrates swapping characters and trimming Strings
	{
		String txt = "" ;
		
		if ( txt.isEmpty()) txt = "    Borrocudo    " ;
		
		System.out.println("String: " + txt) ; //Displays original String
		System.out.println("Original String Length: " + txt.length()); //displays length of original String
		
		txt = txt.trim() ;
		System.out.println("String: " + txt) ;
		System.out.println("String Length: " + txt.length()); //Trims spaces off String
		
		char initial = txt.charAt(0) ;
		System.out.println("First Letter: " + initial) ; //Displays first character
		
		initial = txt.charAt((txt.length()-1)) ;
		System.out.println("Last Letter: " + initial) ; //Displays last character
		
		txt = txt.replace('o', 'a') ;
		System.out.println("String: " + txt) ; //Replaces o with a 
	}
}
