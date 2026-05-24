import java.util.Scanner;
public class stairs {
    public static void main(String[] args) {
        // Code for the stairs pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i % 2 == 0) {
                stars += 2;
            }
        }
    }
}
