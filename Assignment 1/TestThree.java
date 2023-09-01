import java.util.Scanner;

public class TestThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n, num = 1;
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.printf("%3d", num);
                    num++;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}