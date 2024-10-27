package array;
public class arraypratice {
    public static void array1(int arr[]) {
        for(int i=0; i<arr.length; i++){
            arr[i] +=1;
        }
    }
    public static void main(String[] args) {
        /*TO INITIALIZE
        int arr[] = new int[3];
        arr[0] =1 ;
        arr[1] =2 ;
        arr[2] =3 ; */
        //String arr[] = {"apple", "orange", "banana"};
        //char arr[] = {'a', 'b', 'c'};
        /*TO PRINT ARRAY*/
        int arr[] = {1, 2, 3, 4, 5};
        array1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
