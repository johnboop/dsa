import java.util.Arrays;
import java.util.Vector;

public class Coin_Changing {
    public static int minCoins(int coins[], int m, int V) {
        if (V == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (coins[i] <= V) {
                int sub_res = minCoins(coins, m, V - coins[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }

    static int findMin(int coins[], int n,int V)
    {
        int ans=0;
        Arrays.sort(coins);
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= coins[i]) 
            {
                V -= coins[i];
                ans++;
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int coins[] = { 9, 1, 1, 1 };
        int m = coins.length;
        int V = 17;
        System.out.println("Minimum coins required is " + minCoins(coins, m, V));
        System.out.println("Minimum coins required is " + findMin(coins, m, V));
    }
}
