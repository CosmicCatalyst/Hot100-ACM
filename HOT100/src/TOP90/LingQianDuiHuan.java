package TOP90;

import java.util.Scanner;

public class LingQianDuiHuan {
    public static int coinChange(int[] coins, int amount){
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE-1;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        if(dp[amount]==Integer.MAX_VALUE-1){
            return -1;
        }
        return dp[amount];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        int count= scanner.nextInt();
        System.out.println(coinChange(nums,count));
    }
}
