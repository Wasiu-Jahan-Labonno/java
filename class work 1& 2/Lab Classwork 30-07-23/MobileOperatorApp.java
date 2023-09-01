import java.util.Scanner;

public class MobileOperatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Mobile Operator Menu:");
            System.out.println("1. Check your mobile number");
            System.out.println("2. Offers:");
            System.out.println("   1. Get 20 min 20tk");
            System.out.println("   2. Get 2 GB 20tk");
            System.out.println("3. Check your Internet Balance");
            System.out.println("4. Check your Talktime Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your mobile number is: 1234567890"); // Replace with the actual number
                    break;
                case 2:
                    System.out.println("Offers:");
                    System.out.println("   1. Get 20 min 20tk");
                    System.out.println("   2. Get 2 GB 20tk");
                    int offerChoice = scanner.nextInt();
                    switch (offerChoice) {
                        case 1:
                            System.out.println("You have subscribed to Get 20 min 20tk offer.");
                            break;
                        case 2:
                            System.out.println("You have subscribed to Get 2 GB 20tk offer.");
                            break;
                        default:
                            System.out.println("Invalid offer choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Your Internet Balance is 5 GB"); // Replace with the actual balance
                    break;
                case 4:
                    System.out.println("Your Talktime Balance is 100 min"); // Replace with the actual balance
                    break;
                case 5:
                    System.out.println("Exiting the application");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
