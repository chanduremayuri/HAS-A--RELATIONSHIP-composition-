class Engine1 
{
    double  hoursePower ;
    double  capacity ;
    String  engineType ;
    double  mileage ;
    int  noOfPiston ;


    Engine1(double  hoursePower ,double  capacity ,String  engineType , double  mileage ,int  noOfPiston )
    {
    	this.hoursePower = hoursePower;
    	this.capacity = capacity;
    	this.engineType =engineType;
    	this.mileage =mileage;
    	this.noOfPiston =noOfPiston;
    }
     public void displayEngine1()
     {
     	System.out.println("*** Engine1  DEtails ***");
		System.out.println("HoursePower:" +hoursePower);
		System.out.println("Capacity :" +capacity);
		System.out.println("EngineType :" +engineType);
		System.out.println("Mileage:" +mileage);
		System.out.println("No of Piston:" +noOfPiston);
     }
}