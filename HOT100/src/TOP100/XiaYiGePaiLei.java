package TOP100;

import java.util.Arrays;
import java.util.Scanner;

public class XiaYiGePaiLei {
    public static void nextPermutation(int[] nums){
        int n=nums.length;
        int i=n-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while (nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reserv(nums,i+1,n-1);
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reserv(int[] num,int l,int r){
        while (l<r){
            swap(num,l++,r--);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(num));
        nextPermutation(num);
        System.out.println(Arrays.toString(num));
    }
}
