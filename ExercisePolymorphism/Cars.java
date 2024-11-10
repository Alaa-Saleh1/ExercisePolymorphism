package ExercisePolymorphism;

public class Cars implements Vehicle{
    private String model;
    private double days;
    static final int daily_rate=50;

    public Cars(String model,double days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days * daily_rate;
    }

    @Override
    public void displayDetails() {

        System.out.println("Car Model: "+model+"\nDaily Rental Rate: $"+daily_rate+"\nRental Cost: $"+calculateRentalCost()+"\n");

    }
}
