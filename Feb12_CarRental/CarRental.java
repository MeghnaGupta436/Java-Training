package Feb12_CarRental;
import java.sql.SQLOutput;
import java.util.*;
public class CarRental {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        rentalAgency obj=new rentalAgency();
        obj.mainMenu();
    }
    abstract class Vehicle { //Abstract class rental
        private String make; // brand name of car
        private String model; //model number of car
        private int year; //year of manufacturing
        private double rentalPrice; //rental price of car

        abstract void carRentalCost();

        Vehicle(String make, String model, int year, double rentalPrice) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.rentalPrice = rentalPrice;
        }

        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public String getmodel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getyear() {
            return year;
        }
        public void setyear(int year) {
            this.year = year;
        }
        public double getRentalPrice() {
            return rentalPrice;
        }
        public void setRentalPrice(double rentalPrice) {
            this.rentalPrice = rentalPrice;
        }
        class Car extends Vehicle {
            int numSeats;//number of seats in vehicle
            String fueltype; //fuel type used in vehicle

            Car(String make, String model, int year, double rentalPrice, int numSeats, String fueltype) {
                super(make, model, year, rentalPrice);
                this.numSeats = numSeats;
                this.fueltype = fueltype;
            }

            public void carRentalCost() {
            }
        }

        class Customer {
            String name;
            String email;
            String rentedVehicle;

            Customer(String name, String email, String rentedVehicle) {
                this.name = name;
                this.email = email;
                this.rentedVehicle = rentedVehicle;
            }

        }
    }
    static class rentalAgency{
        rentalAgency obj=new rentalAgency();
        public void mainMenu(){
            System.out.println("Welcome to Rental Agency");
            System.out.println("========================");
            System.out.println("Please enter the service you want");
            System.out.println("1.Add a vehicle \n2.Search a vehicle " +
                    "\n3.Display vehicle available for rent \n4.Add a new customer" +
                    "\n5.Rent a vehicle \n6.Return a vehicle");
            int service=sc.nextInt();
            switch(service){
                case 1:addVehicle();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter a valid choice");

            }
        }
        public void addVehicle(){
            System.out.println("Enter the number of vehicle");
            String carNum=sc.nextLine();
            System.out.println("Enter make of vehicle");
            String make=sc.nextLine();
            System.out.println("Enter model of vehicle");
            String model=sc.nextLine();
            System.out.println("Enter the year of manufacturing");
            int year=sc.nextInt();
            System.out.println("Enter per day rent of car");
            double rent=sc.nextDouble();
            System.out.printf("Choose the type of vehicle");

        }
        public void chooseVehicle(){
            String choice=sc.nextLine();
            switch(choice){
                case "car":obj.additionalInfo();
                break;
                case "others":System.out.println("Other vehicles will be available soon");
            }
        }
        public void additionalInfo(){
            System.out.println("enter the number of seats");
            int seats=sc.nextInt();
            System.out.println("choose fuel type: \n1.Petrol \nDiesel \nCNG");
            int choose=sc.nextInt();
            switch(choose){
                case 1:String type=sc.nextLine();
                break;
                case 2:type=sc.nextLine();
                break;
                case 3:type=sc.nextLine();
                break;
                default:System.out.println("Enter a valid choice");
            }

        }
    }
}

