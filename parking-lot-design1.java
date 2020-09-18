Parking system

req:
	park 
	
o(1)

1 floor parking lot

user
system
admin
=======

Abstract vehicle
{
	String id;
	parkVehicle();
	delocateVehicle();

}
enum Vehilce_Type
{
	Bike,CAR,BUS;
	
}
ParkingLot
{
	ArrayList <Spot>ParkingSpots;
	//hashmap,list
		
		2 - bus
	HashMap <Vechile,Spot> parked;
	HashMap <Spot,boolean>    
	HashMap <Vehilce_Type,HashSet<Spot>emptySpot();
	bike=  1,7 to 10
	car = 7 to 9
	bus = null  
	
	public int size;
	ParkingLot(Integer size)
	{
		
	}
	searchSpot(Vechile v)
	{
		/*for(int i =0;i<size;i++)
		{
			Spot t = ParkingSpots.get(i);
			if(t.isEmpty()==true)
			{
				int size_vehicle = v.size; //4
				for(int j = i, k =0;j<size&& k<size_vehicle;j++,k++)
				{
					t = ParkingSpots.get(j);
					if(t.isEmpty()==false)
						break;
						
				}
				
			}
		}*/
		
		return -1;
	
	}
	parkVehicle(Vechile v)
	{
		int t searchSpot(v);
	
	}
	delocateVehicle();

}
Spot
{
	Integer id;
	Boolean isEmpty();
	
	spot()
	{
	}

}

Bike extends vehicle
{
	static int size = 1;
}

Car extends Vehicle
{
	static int size = 2;
	
}
Bus extends vehicle
{
	static int size = 4;
}

Runner
{
	main()
	{
		ParkingLot ob = new ParkingLot(10);
		Car car = new Car();
		
		
	
	}


}
