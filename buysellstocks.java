package array;

public class buysellstocks {
    public static void buysell(int prices[]) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int prices[] = {4,3,2,1};
        buysell(prices);
    }
}
