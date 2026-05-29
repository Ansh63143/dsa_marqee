
import java.util.Scanner;

public class decimal_to_binary {
    class Solution {
        public String findDigitsInBinary(int N) {
            StringBuilder binary = new StringBuilder();
            while (N > 0) {
                binary.append(N % 2);
                N /= 2;
            }
            return binary.reverse().toString();
        }
    }
    public static void main(String[] args){
        decimal_to_binary obj = new decimal_to_binary();
        Solution sol = obj.new Solution();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String binaryRepresentation = sol.findDigitsInBinary(N);
        System.out.println("Binary representation of " + N + " is: " + binaryRepresentation);
    }
}
