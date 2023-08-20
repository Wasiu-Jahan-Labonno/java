import java.util.Scanner;

public class TestTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        if (year < 0) {

            System.out.println("Please enter a positive year.");

        } else {

            int yearsAway = 0;

            while ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
                yearsAway++;
                year++;
            }

            System.out.println(+yearsAway);
        }

        scanner.close();
    }

}
