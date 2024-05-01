class CarDriver2 
{
	public static void main(String[] args) 
	{
		

		Car2 obj = new Car2("TATA","NEXON","SUV",900000,5,(new Engine2 (120,1.2d,"PETROL",16,4)));
		obj.displayCar2();
		obj.engine2.displayEngine2();
	}
}