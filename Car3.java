class Car3
{
	String brand;
	String model;
	String type;
	double price ;
	int seatingCapacity;
	Engine3 engine3 =new Engine3(120,1.2,"PETROL",16,4);

	Car3(String brand,String model,String type,double price ,int seatingCapacity )
	{
		this.brand = brand ;
		this.model = model;
		this.type= type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		
	}

	 public void displayCar3()
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

