class Car 
{
	String brand;
	String model;
	String type;
	double price ;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price ,int seatingCapacity ,double  hoursePower ,double  capacity ,String  engineType , double  mileage ,int  noOfPiston)
	{
		this.brand = brand ;
		this.model = model;
		this.type= type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.engine = new Engine(hoursePower ,capacity ,engineType , mileage ,noOfPiston) ;
	}

	 public void displayCar()
	{
		System.out.println("*** Car DEtails ***");
		System.out.println("Brand :" +brand);
		System.out.println("Model :" +model);
		System.out.println("Type :" +type);
		System.out.println("Price:" +price);
		System.out.println("SeatingCapacity:" +seatingCapacity);

	}
}

