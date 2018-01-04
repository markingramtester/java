class Car
{
	private String maker ;
	private String color ;
	private String bodyType ;

	public Car()
	{
		maker = "Porsche"; //This section defines private variables used to store object attributes
		color = "Silver";
		bodyType = "Coupe";
	}

	private String accelerate() //This section defines private method used to store object attributes
	{
		String motion = "Accelerating..." ;
		return motion;
	}

	public void setCar( String brand, String paint, String style )
	{
		maker = brand ; //public method to assign arguments to private variables
		color = paint;
		bodyType = style;
	}

	public void getCar() //public method to retrieve private variable values
	{
		System.out.println( maker +" paint is " + color );
		System.out.println( maker + " style is " + bodyType );
		System.out.println( maker + " is " + accelerate() +"\n" );
	}	
}

class Constructor
{
	public static void main(String[] args)
	{
		Car Porsche = new Car(); //Creates an instance of Car using default values
		Porsche.getCar();

		Car Ferrari = new Car(); //Creates an instance of Car using custom values
		Ferrari.setCar("Ferrari","Red","Sport");
		Ferrari.getCar();
	}
}


