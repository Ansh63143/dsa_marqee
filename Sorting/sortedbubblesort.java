public class sortedbubblesort {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,10};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int flag = 0;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }   
        }
        System.out.println("Sorted array");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
