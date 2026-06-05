import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        int missing = totalSum - arraySum;

        if (missing > 0 && missing <= n) {
            return missing;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMissingNumber(arr, n);

        System.out.println(result);

        sc.close();
    }
}