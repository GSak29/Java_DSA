package Recrusion;

public class GuruSirMethod {
//brutforce method
    public static int minCoin(int[] coins, int rup, int[] dp) {
        if (rup == 0)
            return 0;

        int res = Integer.MAX_VALUE;

        for (int coin : coins) {

            if (coin <= rup) {
                int subres = minCoin(coins, rup - coin,dp);
                if (subres <= Integer.MAX_VALUE) {
                    res = Math.min(res, subres + 1);
                }
            }

        }
        dp[rup]=res;
        return dp[rup];
    }

    public static void main(String[] args) {
        int[] coins = { 9, 6, 5, 1 };
        int n = 56;
        int[] dp = new int[n+1];
        System.out.println(minCoin(coins, n,dp));

    }

}
