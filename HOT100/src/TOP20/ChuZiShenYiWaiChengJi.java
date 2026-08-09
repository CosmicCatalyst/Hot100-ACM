package TOP20;

import java.util.Arrays;
import java.util.Scanner;

public class ChuZiShenYiWaiChengJi {
    public static int[] productExceptSelf(int[] nums){
        int[] ans=new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int tmep=1;
        for(int i=nums.length-2;i>=0;i--){
            tmep*=nums[i+1];
            ans[i]*=tmep;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(productExceptSelf(num)));
    }
}
