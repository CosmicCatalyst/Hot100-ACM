package TOP90;

import java.util.Scanner;

public class FenGeDengHeZiJi {
    public static boolean canPartition(int[] nums){
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0){
            return false;
        }
        int tager=sum/2;
        boolean[][] dp=new boolean[nums.length][tager+1];
        if(nums[0]<=tager){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<=tager;j++){
                if(nums[i]<=j){
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
            if(dp[i][tager]){
                return true;
            }
        }
        return dp[nums.length-1][tager];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(canPartition(num));
    }
}
