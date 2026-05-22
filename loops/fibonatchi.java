import java.util.*;
public class fibonatchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prev = 0;
        int curr = 1;
        // int fib = 0;
        for(int i = 1;i<= a;i++){
            System.out.print(prev + " ");
        int next =  prev + curr;
            prev = curr;
            curr = next;

        }
        System.out.println(prev);
        
    }
}