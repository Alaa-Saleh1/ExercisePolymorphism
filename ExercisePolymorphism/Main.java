package ExercisePolymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

        System.out.println("---------------------------------------");
        System.out.println("---Welcome to Vehicle Rental System!---");
        int choice;
        do {
            System.out.println("---------------------------------------\n"+
                    "Vehicle Rental System   \n" +
                    "1. Rent a Car   \n" +
                    "2. Rent a Bike   \n" +
                    "3. Rent a Truck   \n" +
                    "4. View Rented Vehicles   \n" +
                    "5. Exit \n"+
                    "Enter your choice:" );
            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Car Model: ");
                    String model=input.nextLine();
                    System.out.println("Enter Rental Days: ");
                    double day =input.nextDouble();
                    Cars car = new Cars(model,day);
                    rentedVehicles.add(car);
                    System.out.println("#Rental Details: ");
                    car.displayDetails();
                    break;
                case 2:
                    System.out.println("Enter Bike Brand: ");
                    String brand =input.nextLine();
                    System.out.println("Enter Rental Hours: ");
                    double hour =input.nextDouble();
                    Bikes bikes = new Bikes(brand, hour);
                    rentedVehicles.add(bikes);
                    System.out.println("#Rental Details: ");
                    bikes.displayDetails();
                    break;
                case 3:
                    System.out.println("Enter Trucks Type: ");
                    String type =input.nextLine();
                    System.out.println("Enter Rental Weeks: ");
                    double week =input.nextDouble();
                    Trucks trucks = new Trucks(type, week);
                    rentedVehicles.add(trucks);
                    System.out.println("#Rental Details: ");
                    trucks.displayDetails();
                    break;
                case 4:
                  for (Vehicle vehicle:rentedVehicles){
                      vehicle.displayDetails();
                  }
                  break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice, please try again. ");
            }


        }while (choice != 5);
        System.out.println("Thank you for using the Vehicle Rental System! ");
        System.out.println("   ---------------------------------------");
    }

}