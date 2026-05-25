import java.util.Scanner;
public class second_last_isEven {
    public static boolean isSecondLastDigitEven(int n) {
        int secondLastDigit = (n / 10) % 10; 
        return secondLastDigit % 2 == 0; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isSecondLastDigitEven(n);
        System.out.println(result);
    }
}
