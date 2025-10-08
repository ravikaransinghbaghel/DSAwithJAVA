package Arrays.questions;

public class buyAndsell {
    public static void sellAndBuyStock(int price[]) {
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyonday = 0, sellonday = 0;
        for (int i = 0; i < price.length; i++) {
            if (bp < price[i]) {
                int profit = price[i] - bp;
                if (maxProfit < profit) {
                    maxProfit = profit;
                    sellonday = i + 1;
                }
            } else {
                bp = price[i];
                buyonday = i + 1;
            }
        }
        System.out.println(
                "the profit is " + maxProfit + " and sell on day " + sellonday + " and buy on day " + buyonday);

    }

    public static void main(String[] args) {
        int prices[] = { 8, 2, 4, 24, 3,  1, 4 };
        sellAndBuyStock(prices);
    }
}