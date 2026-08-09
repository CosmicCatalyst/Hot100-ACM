package TOP20;

import java.util.Arrays;
import java.util.Scanner;

public class LunZhuanShuZu {
    public static void rotate(int[] nums, int k){
        k%=nums.length;
        copy(nums,0,nums.length-1);
        copy(nums,0,k-1);
        copy(nums,k,nums.length-1);
    }
    public static void copy(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        rotate(num,k);
        System.out.println(Arrays.toString(num));
    }
}
