import java.util.Scanner;

public class subtracting2_diff_array_using_borrow {

    public static int[] subtracting2_diff_array(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[Math.max(n, m)];

        int i = n - 1;
        int j = m - 1;
        int k = result.length - 1;

        int borrow = 0;

        while (k >= 0) {

            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;

            digit2 = digit2 + borrow;

            if (digit2 < digit1) {
                digit2 += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            result[k] = digit2 - digit1;

            i--;
            j--;
            k--;
        } 

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = subtracting2_diff_array(arr1, arr2);

        System.out.println("Result:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}