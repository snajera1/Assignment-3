import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the metric converter!");
        int choice = 0; //Establishes a variable that 
        Scanner scanner = new Scanner(System.in);

        while (choice != 5) {
            System.out.println("Please enter the number of the conversion you would like to preform:"); //Prints instructions for the user
            System.out.println("1. Feet to Meters");
            System.out.println("2. Inches to CM");
            System.out.println("3. Miles to KM");
            System.out.println("4. MM to Inches");
            System.out.println("5. Exit");
            choice = scanner.nextInt(); //Assigns user input to variable that determines what the following switch block will do

            switch (choice) {
                case 1:
                    System.out.println("Please enter the feet value:");
                    if (scanner.hasNextFloat() == true) {
                        float foot = scanner.nextFloat();
                        System.out.println(foot + " feet is equal to " + (foot / 3.28084) + " meters.");
                    } else{
                        System.out.println("Please enter a valid number: ");
                        scanner.next();
                        float foot = scanner.nextFloat();
                        System.out.println(foot + " feet is equal to " + (foot / 3.28084) + " meters.");
                    }
                    continue;
                case 2:
                    System.out.println("Please enter the inches value: ");
                    float inches = scanner.nextFloat();
                    System.out.println(inches + " inches is equal to " + (inches * 2.54) + " cm.");
                    continue;
                case 3:
                    System.out.println("Please enter the miles value: ");
                    float miles = scanner.nextFloat();
                    System.out.println(miles + " miles is equal to " + (miles * 1.6093445) + " km.");
                    continue;
                case 4:
                    System.out.println("Please enter the MM value: ");
                    float mm = scanner.nextFloat();
                    System.out.println(mm + " mm is equal to " + (mm / 25.4) + " inches.");
                    continue;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid input (1-5).");
                    continue;
            }

        }
        
    }
}
