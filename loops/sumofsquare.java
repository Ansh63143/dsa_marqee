import java.util.*;
public class sumofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0;
        while(num1 > 0){
            int digit = num1%10;
            sum += (digit*digit);
            num1 = num1/10;
        }
        System.out.println(sum);
    }
}
