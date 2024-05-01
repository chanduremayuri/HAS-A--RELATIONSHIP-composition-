class Car1 
{
	String brand;
	String model;
	String type;
	double price ;
	int seatingCapacity;
	Engine1 engine1;

	Car1(String brand,String model,String type,double price ,int seatingCapacity )
	{
		this.brand = brand ;
		this.model = model;
		this.type= type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.engine1 = new Engine1(120,1.2d,"PETROL",16,4) ;
	}

	 public void displayCar1()
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

