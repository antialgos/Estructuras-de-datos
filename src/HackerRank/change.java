package HackerRank;

public class change {
    public static int chang(int amount, int[] coins) {
        
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for (int coin : coins) {
            for (int x = 1; x < dp.length; x++) {
                if (x >= coin) {
                    dp[x] += dp[x - coin];
                }
            }
        }
        
        return dp[amount];
    }
    public static void main(String[] args) {
        System.out.println(chang(5,new int[] {1,2,5}));
    }
}
