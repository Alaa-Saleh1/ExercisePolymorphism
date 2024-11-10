package ExercisePolymorphism;

public class Bikes implements Vehicle{

    private String brand;
    private double hour;
    static final int hour_rate=10;

    public Bikes(String brand, double hour) {
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * hour_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+brand+"\nDaily Rental Rate: $"+hour_rate+"\nRental Cost: $"+calculateRentalCost()+"\n");

    }
}
