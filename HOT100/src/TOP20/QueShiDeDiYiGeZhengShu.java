package TOP20;

import java.util.Scanner;

public class QueShiDeDiYiGeZhengShu {
    public static int firstMissingPositive(int[] nums){
        for(int i=0;i<nums.length;i++){
            while (nums[i]>=1&&nums[i]<nums.length&&nums[i]!=nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] test=new int[strings.length];
        for(int i=0;i<test.length;i++){
            test[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(firstMissingPositive(test));
    }
}
