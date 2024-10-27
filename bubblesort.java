package sort;

public class bubblesort {
    public static void bubble(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int swap = 0;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
            if(swap == 0){
                System.out.println(swap);      
                break;
            }
        }
    }
    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int[] arr = {5,4,1,3,2};
        int[] arr1 = {15,24,-1,0,21,5,11 };
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        bubble(arr1);
        print(arr1);
    }
}
