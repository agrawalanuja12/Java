package ArraysMatrics;
public class Stock {
    
    public static int Buy_sell_stock(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }

        }
        return maxProfit;

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("the max profit is : "+Buy_sell_stock(prices));
    }
}
