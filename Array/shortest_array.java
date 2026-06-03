public class shortest_array {
        public static int shortDistance(int[] arr, int n){
        int res = -1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = i+ 1; j < n; j++){
                    if(arr[j] % 2 == 0){
                        if(res == -1) res = j-i;
                        res = Math.min(res, j-1);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={ 1, 2, 3 ,6, 7};
        int n = arr.length;
        System.out.println(shortDistance(arr, n));
    }
}
