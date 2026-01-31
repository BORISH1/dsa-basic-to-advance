public class BestTimeToBuyAStock {
    public int maxsoFar(int[] prices){
        int minsoFar = prices[0];
        int ans = 0;
        for( int i=0; i<prices.length; i++){
            int profit = prices[i] - minsoFar;
            if(profit > ans){
                ans = profit;
            }
            minsoFar = Math.min(prices[i], minsoFar);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,4,6,3};
        BestTimeToBuyAStock obj = new BestTimeToBuyAStock();
        int result = obj.maxsoFar(prices);
        System.out.println("The maximum profit is " + result);
    }
}
