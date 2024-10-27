package array;

public class binarysearch {
    public static int binary(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        for(int i=0; i<arr.length; i++){
            while(low<=high){
                mid = (low+high)/2;
                if(key == arr[mid]){
                    return mid;
                }
                if(key<arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,8,11,15};
        int key = 8;
        int result = binary(arr, key);
        System.out.println(result);
    }
}
