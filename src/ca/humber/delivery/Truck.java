
package ca.humber.delivery;

public class Truck {
    private int currentX;
    private int currentY;
    private double fuel;
    private double fuelConsumption;
    
    public Truck() {
        fuel = 100;
        fuelConsumption = 20;
    }
    
    public void deliverTo(int destX, int destY) {
        // calculate the distance
        int distance = calculateDistance(destX, destY);
        
        // calculate consumed fuel
        double consumedFuel = calculateFuel(distance);
        
        // Update amount of fuel
        updateFuel(-consumedFuel);
        
        // update current location
        updateCurrentLocation(destX, destY);
    }
    
    public void updateCurrentLocation(int xDest, int yDest) {
        currentX = xDest;
        currentY = yDest;
    }
    
    public void updateFuel(double fuelAmount) {
        fuel += fuelAmount;
    }
    
    // Calculate consumed fuel
    public double calculateFuel(int distance) {
        return distance * 20 / 100;
    }
    
    // Calculate the distance to the delivery location
    public int calculateDistance(int destX, int destY) {
        // Calculate the distance along the X
        int xDistance = Math.abs(currentX - destX);
 
        // Calculate the distance along the Y
        int yDistance = Math.abs(currentY - destY);
        
        // Calculate the total distance
        int totalDistance = xDistance + yDistance;
        
        return totalDistance;
  //     return Math.abs(currentX - destX) + Math.abs(currentY - destY);
    }
    
    public void printInfo() {
        System.out.println("Current location is " + currentX + ", " + currentY +
                "; amount of fuel left is: " + fuel);
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
    
    
}
