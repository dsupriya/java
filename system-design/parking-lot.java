import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      ParkingLot ParkingLotOb = new ParkingLot(4);
      Vehicle car = new Vehicle("Nexon");
      ParkingLotOb.park(car);
      //ParkingLotOb.remove(car);
      Vehicle car1 = new Vehicle("Honda");
      ParkingLotOb.park(car1);
      ParkingLotOb.remove(car);
      
      
      
    }
}
class Vehicle
{
    String plate;
    Vehicle(String s)
    {
        this.plate = s;
    }
    
}
class Spot
{
    boolean isFull;
    Vehicle vehicle;
    Integer start_time;
    Spot(boolean isEmpty,Vehicle v, Integer s)
    {
        this.isFull = isEmpty;
        this.vehicle = v;
        this.start_time =s;
    }
    
    
    
}

class ParkingLot
{
    final int capacity;
    Spot [] ParkingSpots;
    
    
    
    
    public ParkingLot(int capacity)
    {
        this.capacity = capacity;
        ParkingSpots = new Spot[capacity];
    }
    public Integer  findVacantPlace()
    {
        for(int i=0;i<this.capacity;i++)
        {
            if(ParkingSpots[i]==null)
                return i;
        }
        return null;
    }
    public Integer findVehicle(Vehicle v)
    {
        for(int i=0;i<this.capacity;i++)
        {
            if(ParkingSpots[i]!=null && ParkingSpots[i].vehicle.plate==v.plate)
                return i;
        }
        System.out.println(v.plate+" not found in the parking");
        return null;
    }
    
    
    
    public void park(Vehicle car)
    {
        Integer current_spot = findVacantPlace();
        if(current_spot==null)
        {
            System.out.println("Parking lot is full");
            return;
        }
        Spot parkingSpot = new Spot(true,car,10); 
        ParkingSpots[current_spot] = parkingSpot;
        System.out.println("Vehicle "+car.plate+" is parked at "+current_spot);
    }
    public void remove(Vehicle car)
    {
        Integer current_spot = findVehicle(car);
        if(current_spot==null)
        {
            System.out.println(car.plate+" error while removing the vechicle");
            return;
        }
        Integer price = ParkingSpots[current_spot].start_time*10;
        System.out.println("Please pay Rs."+price);
        System.out.println(car.plate+" is removed from parking");
        ParkingSpots[current_spot] = null;
        
    }
}
