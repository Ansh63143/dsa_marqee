// Java program to find if there exist three elements in
// Geometric Progression or not
import java.util.*;

class GFG 
{

static void findGeometricTriplets(int arr[], int n)
{

    for (int j = 1; j < n - 1; j++)
    {
        int i = j - 1, k = j + 1;

        while (i >= 0 && k <= n - 1){
            
            while (i >= 0 && arr[j] % arr[i] == 0 &&
                    arr[k] % arr[j] == 0 &&
                    arr[j] / arr[i] == arr[k] / arr[j])
            {
            
                System.out.println(arr[i] +" " + arr[j]
                    + " " + arr[k]);

        
                k++ ; i--;
            }
            if(i >= 0 && arr[j] % arr[i] == 0 &&
                    arr[k] % arr[j] == 0)
            {
                if(i >= 0 && arr[j] / arr[i] < arr[k] / arr[j])
                    i--;
                else k++;
            }
            else if (i >= 0 && arr[j] % arr[i] == 0)
                k++;
            else i--;
        }
    }
}

public static void main(String[] args) 
{

    int arr[] = {1, 2, 4, 16};
    int n = arr.length;

    findGeometricTriplets(arr, n);
}
}
