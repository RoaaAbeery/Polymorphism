import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        boolean continueMenu = true;



        while (continueMenu) {

            System.out.println("\nMenu:");
            System.out.println("1.Rent a Car ");
            System.out.println("2. Rent a Bike ");
            System.out.println("3. Rent a Truck ");
            System.out.println("4. View Rented Vehicles ");

            System.out.print("Enter your choice: ");

//            scanner.next();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Car Model:");
                    String model = scanner.next();
                    System.out.println("Enter Rental Days:");
                    int day= scanner.nextInt();
                    System.out.println("Rental Details: ");
                    Vehicle c =new Car(model,day);
                    c.displayDetails();
                    rentedVehicles.add(c);

                    break;
                case 2:
                    System.out.println("Enter Bike brand :");
                    String brand =scanner.next();
                    System.out.println("Enter Rental hours");
                    int hours= scanner.nextInt();
                    System.out.println("Rental Details: ");
                    Vehicle b=new Bike(brand,hours);
                    b.displayDetails();
                    rentedVehicles.add(b);

                    break;

                case 3:
                    System.out.println("Enter Truck type :");
                    String type =scanner.next();
                    System.out.println("Enter Rental week");
                    int week= scanner.nextInt();
                    System.out.println("Rental Details: ");
                    Vehicle t=new Truck(type,week);
                    t.displayDetails();
                    rentedVehicles.add(t);
                    break;

                case 4:
                    System.out.println("Rented Vehicles :");
                    for (int i = 0; i < rentedVehicles.size();i++)
                    {
                        rentedVehicles.get(i).displayDetails();

                    }
                    break;


                case 5:
                    continueMenu = false;
                    System.out.println("Thank you for using the Vehicle Rental System! ");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        }

    }

//   Vehicle c=new Car();

    }
