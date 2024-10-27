package array;

public class reversearray {
    public static void reverse(int arr[]) {
        for(int i=arr.length-1;i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void reverseswap(int arr[]) {
        int temp;
        for(int i=0;i<=arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i=0;i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //reverseswap(arr);
        int arr1[] = {3,4,8,3,5,8,9,3};
        reverseswap(arr1);

    }
}
