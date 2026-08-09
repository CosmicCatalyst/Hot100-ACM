package TOP90;

import java.util.Arrays;
import java.util.Scanner;

public class ZuiChangDIZhengZiXvLei {
    public static int lengthOfLIS(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(lengthOfLIS(nums));
    }
}
