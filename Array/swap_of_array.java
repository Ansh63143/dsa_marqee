public class swap_of_array {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2 ,3 ,4};
        int i = 1;
        int j = 2;
            swap(arr, i, j);
                for(int num : arr){
        System.out.println(num);
        }
    }
}
