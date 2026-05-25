import java.util.*;
public class function2 {
public static void add_even_no(int start, int end){
    int sum = 0;
    for(int i = start; i <= end; i++){
        if(i % 2 == 0){
            sum += i;
        }
    }
        System.out.println(sum);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        add_even_no(start, end);
    }
}
