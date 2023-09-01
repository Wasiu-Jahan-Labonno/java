import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the opposite side (in meters): ");
        double opposite = scanner.nextDouble();

        System.out.print("Enter the length of the adjacent side (in meters): ");
        double adjacent = scanner.nextDouble();

        double hypotenuse = Math.sqrt(opposite * opposite + adjacent * adjacent);
        double hypotenuseInFeet = hypotenuse * 3.28084;

        System.out.printf("The length of the hypotenuse is %.4f feet%n", hypotenuseInFeet);

        scanner.close();
    }
}