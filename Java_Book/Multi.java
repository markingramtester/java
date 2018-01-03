class Multi
{
	public static void main( String[] args ) //Example demonstrating using more than one class in a program
	{
		String msg = "This is a local variable in the Multi class" ; //Normal variable
		System.out.println( msg) ;
		System.out.println (Data.txt) ; //Calls variable from Data.java
		Data.greeting(); //Calls method from Data.java
		Draw.line(); //Calls method from Draw.java
	}
}
