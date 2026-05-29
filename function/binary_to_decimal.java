import java.util.Scanner;
public class binary_to_decimal {
        class Solution {
            public int binaryToDecimal(String binary) {
                int decimalValue = 0;
                int length = binary.length();
                for (int i = 0; i < length; i++) {
                    char bit = binary.charAt(length - 1 - i);
                    if (bit == '1') {
                        decimalValue += Math.pow(2, i);
                    }
                }
                return decimalValue;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        binary_to_decimal obj = new binary_to_decimal();
        Solution sol = obj.new Solution();
        int decimalValue = sol.binaryToDecimal(binaryString);
        System.out.println("Decimal value of " + binaryString + " is: " + decimalValue);

    }
}