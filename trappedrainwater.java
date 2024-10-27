package array;

public class trappedrainwater {
    public static void trappedwater(int bars[], int leftauxi[], int rightauxi[]) {
        int n = bars.length;
        int min = 0;
        int water = 0;
        if(n >= 3){
            for(int i=0; i<bars.length; i++){
                min = Math.min(leftauxi[i], rightauxi[i]);
                water += min-bars[i];
                
            }
            System.out.println(water);
        }
        else{
            System.out.println("There is no trapped water");
        }
    }
    public static void main(String[] args) {
        int bars[] = {4,2,0,6,3,2,5};
        int leftauxi[] = new int[bars.length];
        int rightauxi[] = new int[bars.length];
        leftauxi[0] = bars[0];
        for(int i=1; i<bars.length; i++){
            leftauxi[i] = Math.max(bars[i], leftauxi[i-1]);
        }
        rightauxi[bars.length-1] = bars[bars.length-1];
        for(int i=bars.length-2; i>=0; i--){
            rightauxi[i] = Math.max(bars[i], rightauxi[i+1]);
        }
        trappedwater(bars, leftauxi, rightauxi);

    }
}
