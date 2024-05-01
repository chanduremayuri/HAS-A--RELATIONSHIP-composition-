class Car2
{
	String brand;
	String model;
	String type;
	double price ;
	int seatingCapacity;
	Engine2 engine2;

	Car2(String brand,String model,String type,double price ,int seatingCapacity ,Engine2 engine2)
	{
		this.brand = brand ;
		this.model = model;
		this.type= type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.engine2 = engine2 ;
	}

	 public void displayCar2()
	{
		System.out.println("*** Car DEtails ***");
		System.out.println("Brand :" +brand);
		System.out.println("Model :" +model);
		System.out.println("Type :" +type);
		System.out.println("Price:" +price);
		System.out.println("SeatingCapacity:" +seatingCapacity);
		System.out.println();

	}
}

