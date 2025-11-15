package Questions.Arrays;

public class MostProfit {
    public static void buySell(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int sell = 0;
        int buy = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buy = i;
            }
            if (maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
                sell = i;
            }

        }
        System.out.println("buy at: day " + buy + ", sell at: day " + sell + ", max profit is: " + maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 5, 3, 2, 1 };
        buySell(prices);
    }
}
