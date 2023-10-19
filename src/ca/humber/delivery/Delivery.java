
package ca.humber.delivery;

public class Delivery {

    public static void main(String[] args) {
        // Create an object of Truck
        Truck truck = new Truck();
        
        truck.deliverTo(50, 50);
        
        truck.printInfo();
        
        truck.deliverTo(100, 20);
        
        truck.printInfo();
        
        truck.updateFuel(30);
        
        truck.printInfo();
    }
    
}
