import java.util.*;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();
        while(min != 0){
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);
    }
}
