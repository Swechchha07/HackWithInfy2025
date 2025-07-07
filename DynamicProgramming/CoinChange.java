import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 5, 6, 9};
        int amount = 11;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; 
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("Not possible to make amount " + amount);
        } else {
            System.out.println("Minimum coins required: " + dp[amount]);
        }
    }
}
