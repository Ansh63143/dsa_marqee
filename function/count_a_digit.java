import java.util.Scanner;
public class count_a_digit {
    public static int countDigit(int n, int digit) {
        int count = 0;
        while (n > 0) {
            int Ld = n % 10;
            if (Ld == digit) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int result = countDigit(n, digit);
        System.out.println(result);

    }
}
