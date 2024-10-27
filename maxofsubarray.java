package array;

public class maxofsubarray {
    public static void subarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        //optimised approach Prefix approach
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                /*for(int k=i; k<=j; k++){
                    //System.out.print(arr[k]+" " );
                    sum += arr[k];
                    if(sum>max){
                        max = sum;
                    } */
                    sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                    if(sum>max){
                        max = sum;
                    }
                }
            }
            System.out.print(" Max: "+max);
            System.out.println();
        }

    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        int arr[] = {1,-2, 6,-1, 3};
        subarray(arr);
        
    }
}

