import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n, array[][] = new int[10000][10000];
        long multiply = 1;
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = input.nextInt();
                if (i != j) {
                    multiply *= array[i][j];
                }
            }
        }
        System.out.println(multiply);
    }
}