package My_DSA_Journey.Arrays.Part2;

public class C_Buy_Sell_Stocks {
    public static int Buy_Sell_Stocks(int sellprice[]) {
        int buyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for (int i = 0; i < sellprice.length; i++) {
            if (buyPrice < sellprice[i]) {
                int profit = sellprice[i] - buyPrice;
                Maxprofit = Math.max(profit, Maxprofit);
            } else {
                buyPrice = sellprice[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(Buy_Sell_Stocks(prices));
    }
}
