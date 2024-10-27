package array;

public class kadanesalgo {
    public static void maxsumarray(int arr[]) {
        int sum = 0;
        //int maxsum = Integer.MIN_VALUE;
        //for all negatives 
        int maxsum = arr[0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
                if(sum>maxsum){
                    maxsum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
        maxsumarray(arr);
    }
}
