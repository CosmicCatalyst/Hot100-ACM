package TOP90;

import java.util.Scanner;

public class DaJiaJieShe {
    public static int rob(int[] nums){
        if(nums==null||nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[1],nums[0]);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(rob(num));
    }
}
