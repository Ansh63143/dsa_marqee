// package Function;
import java.util.*;
public class function {
    public static boolean Age(int age){
        if(age >= 10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println(Age(num1)?"Age":"Not child");
        }
    }

