class Car
{
	
	private String maker ;
	private String color ;
	private String bodyType ;

	private String accelerate()
	{
		String motion = "Accelerating..." ;
		return motion ;
	}
	
	public void setCar( String brand, String paint, String style)
	{
		maker = brand ; //maker = brand which in case one equals Porsche
		color = paint ; //color = paint which in case one equals Red
		bodyType = style ; //bodyType = style which in case one equals Saloon
	}
	
	public void getCar()
	{
		System.out.println( maker + " paint is " + color) ;
		System.out.println( maker + " style is " + bodyType) ;
		System.out.println( maker + " is " + accelerate() + "\n") ;
	}
}


 class SafeInstance
{
	public static void main( String[] args ) //Example code demonstrating enscapulating properties
	{
		Car Porsche = new Car() ;
		Porsche.setCar( "Porsche", "Red", "Saloon" ) ; //Calls setCar
		Porsche.getCar() ; //Calls getCar
		
		Car Bentley = new Car() ;
		Porsche.setCar( "Bentley", "Green", "Saloon" ) ;
		Porsche.getCar() ;
	}
}