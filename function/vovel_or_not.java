import java.util.*;
public class vovel_or_not {
 static boolean vovel_check(char c){
    boolean isVovel = false;
    if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c =='I' || c == 'o' || c =='O'|| c == 'u' || c =='U'){
        isVovel = true;
    }
    return isVovel;

 }
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 char c = sc.next().charAt(0);
 System.out.println(vovel_check(c)?"vovel":"not a vovel");
}
}