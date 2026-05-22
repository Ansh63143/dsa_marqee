
import java.util.Scanner;

public class hollow_Triangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0;i< n ;i++){
                    for(int j = 0;j<n-i;j++){
                        System.out.print(" ");
                    }
                    for(int k = 0;k<i+1;k++){
                        if(i == n-1 || k == 0 || k == i){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    
