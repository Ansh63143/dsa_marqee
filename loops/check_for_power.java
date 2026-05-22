import java.util.Scanner;

public class check_for_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (y % x == 0) {
            y = y / x;
        }

        if (y == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}