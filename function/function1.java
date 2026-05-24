import java.util.Scanner;
public class function1 {
    static void table_of_n(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        table_of_n(n);
    }
}