package array;

public class printsubarray {
    public static void subarray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    if(arr[k] > max){
                        max = arr[k];
                    }
                    if(arr[k] < min){
                        min = arr[k];
                    }
                    System.out.print(arr[k]+" " );
                }
                System.out.println();
                System.out.print("Sum: "+sum+" Min: "+min+" Max: "+max);
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        //subarray(arr);
        int arr1[] = {11,2,13,-4,5};
        subarray(arr1);
    }
}
