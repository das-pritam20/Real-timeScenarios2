/*
Question 1: Fuel Efficiency Calculator

Create a Car class (BLC Class)

Attributes:
fuelConsumed (in liters, private, double)
distanceTravelled (in kilometers, private, double)

Methods:
Setters:
public void setFuelConsumed(double fuelConsumed)
public void setDistanceTravelled(double distanceTravelled)

Getters:
public double getFuelConsumed()
public double getDistanceTravelled()

calculateMileage() Method:
Purpose: Calculate and return mileage (km per liter).
Formula: mileage = distanceTravelled / fuelConsumed
Return Type: double

calculateFuelEfficiency() Method:
Purpose: Calculate and return fuel efficiency in liters per 100km.
Formula: fuelEfficiency = (fuelConsumed / distanceTravelled) * 100
Return Type: double

Tester Class:
Test Case 1:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Mileage = 15.0 km/l
Test Case 2:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Fuel Efficiency = 6.67 L/100km
*/



import java.util.Scanner;
class Car{
    private double fuelConsumed;
    private double distanceTravelled;

    public void setFuelConsumed(double fuelConsumed){
        this.fuelConsumed = fuelConsumed;
    }
    public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled = distanceTravelled;
    }

    public double getFuelConsumed(){
        return fuelConsumed;
    }
    public double getDistanceTravelled(){
        return distanceTravelled;
    }

    public double calculateMileage(){
        double mileage = distanceTravelled / fuelConsumed;
        return mileage;
    }

    public double calculateFuelEfficiency(){
        double fuelEfficiency = (fuelConsumed / distanceTravelled) * 100;
        return fuelEfficiency;
    }
}


public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();


        System.out.print("Enter fuel consumed: ");
        double fuelConsumed = sc.nextDouble();
        c1.setFuelConsumed(fuelConsumed);

        System.out.print("Enter distance travelled: ");
        double distanceTravelled = sc.nextDouble();
        c1.setDistanceTravelled(distanceTravelled);

        System.out.println("Mileage = "+ c1.calculateMileage()+" km/l");
        
        System.out.printf("Fuel Efficiency = %.2f  L/100km",c1.calculateFuelEfficiency());
        System.out.println();
        System.out.println("Fuel Consumed: "+c1.getFuelConsumed());

        System.out.println("Distance Travelled: "+c1.getDistanceTravelled());
        
    }
}