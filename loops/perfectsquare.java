import java.util.*;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=80;i++){
            if(i*i >= 20 && i*i <= 80){
                System.out.println(i*i);
            }
            if(i *i > 80) break;
        }
    
    }
}
