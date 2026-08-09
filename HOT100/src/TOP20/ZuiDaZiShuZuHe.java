package TOP20;

import java.rmi.MarshalException;
import java.util.Scanner;

public class ZuiDaZiShuZuHe {
    public static int maxSubArray(int[] nums){
        int ans=nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return  ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] test=s.split(" ");
        int[] number=new int[test.length];
        for(int i=0;i<number.length;i++){
            number[i]=Integer.parseInt(test[i]);
        }
        System.out.println(maxSubArray(number));
    }
}
