class FirstInstance
{
	public static void main( String[] args ) //Example code demonstrating changing the name of a object
	{
		System.out.println("Car paint is " + Car.color) ;
		System.out.println("Car style is " + Car.bodyType) ;
		System.out.println( Car.accelerate()) ;
		
		Car Porsche = new Car() ;
		
		System.out.println("Porsche paint is " + Porsche.color) ;
		System.out.println("Porsche style is " + Porsche.bodyType) ;
		System.out.println( Porsche.accelerate()) ;
	}
}
