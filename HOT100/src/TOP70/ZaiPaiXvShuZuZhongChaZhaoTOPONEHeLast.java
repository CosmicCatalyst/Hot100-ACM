package TOP70;

import java.util.Arrays;
import java.util.Scanner;

public class ZaiPaiXvShuZuZhongChaZhaoTOPONEHeLast {
    public static int[] searchRange(int[] nums, int target){
        int start=lower(nums,target);
        if(start== nums.length||nums[start]!=target){
            return new int[]{-1,-1};
        }
        int end=lower(nums,target+1)-1;
        return new int[]{start,end};
    }
    public static int lower(int[] nums,int taeges){
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(nums[m]>=taeges){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        int targe=scanner.nextInt();
        System.out.println(Arrays.toString(searchRange(nums, targe)));
    }
}
