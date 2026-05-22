import java.util.*;
public class half_pyramid_with_space {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}