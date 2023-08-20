public class Car {
    public String brand;
    public String model;
    public int year;
    public double fuelEfficiency; // Miles per gallon

    // Constructor to set brand, model, and year
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = 25.0; // Default fuel efficiency in miles per gallon
    }

    // Method to calculate maximum distance
    public double calculateMaxDistance(double fuelAmount) {
        // Calculate the maximum distance using fuelEfficiency
        double maxDistance = fuelAmount * fuelEfficiency;
        return maxDistance;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);

        double fuelAmount = 10.0; // Example fuel amount in gallons
        double maxDistance = myCar.calculateMaxDistance(fuelAmount);

        System.out.println("Car: " + myCar.brand + " " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Fuel Efficiency: " + myCar.fuelEfficiency + " miles/gallon");
        System.out.println("Fuel Amount: " + fuelAmount + " gallons");
        System.out.println("Max Distance: " + maxDistance + " miles");
    }
}
