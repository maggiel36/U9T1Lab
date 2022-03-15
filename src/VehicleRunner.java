public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle myBicycle = new Bicycle("Electric Bike", 2, 8);
    System.out.println(myBicycle.getName());
    System.out.println(myBicycle.getWheels());
    System.out.println(myBicycle.getGearCount());
    myBicycle.move(20);
    myBicycle.turn(180);
    myBicycle.brake(0.25);
    myBicycle.ringBell();

    HotAirBalloon myHotAirBalloon = new HotAirBalloon("Cameron Balloons", 0, "Purple");
    System.out.println(myHotAirBalloon.getName());
    System.out.println(myHotAirBalloon.getWheels());
    System.out.println(myHotAirBalloon.getColor());
    myHotAirBalloon.move(20);
    myHotAirBalloon.turn(10);
    myHotAirBalloon.brake(0.01);
    myHotAirBalloon.woosh();




  }
}