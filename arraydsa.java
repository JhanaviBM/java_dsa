package array;
import java.util.*;
public class arraydsa {
    public static void linearsearch(/*int arr[], int key */String menu[], String item) {
        /*for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1; */
        for(int i=0; i<menu.length; i++){
            if(menu[i] == item){
                System.out.print("Item "+item+" at index:"+i);
                break;
            }
            
        }
    }

    public static void largestarray(int arr[]) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>minValue){
                minValue = arr[i];
            }
            if(arr[i]<maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println(minValue);
        System.out.println(maxValue);

    }
    public static void main(String[] args) {
        /*int arr[] = {5,7,3,2,6,7};
        int key = 2;
        int index = linearsearch(arr,key);
        System.out.println(index); 
        String menu[] = {"dosa", "idli", "samosa", "vada", "upma"};
        String item = "samosa";
        linearsearch(menu, item);*/
        int arr[] = {5,1,3,2,6,1};
        largestarray(arr);
    }
}
