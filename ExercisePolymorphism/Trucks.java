package ExercisePolymorphism;

public class Trucks implements Vehicle{

    private String type;
    private double week;
    static final int weekly_rate=500;

    public Trucks(String type, double week) {
        this.type = type;
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week * weekly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: "+type+"\nDaily Rental Rate: $"+weekly_rate+"\nRental Cost: $"+calculateRentalCost()+"\n");


    }
}
