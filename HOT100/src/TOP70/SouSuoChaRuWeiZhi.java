package TOP70;

import java.util.Scanner;

public class SouSuoChaRuWeiZhi {
    public static int searchInsert(int[] nums, int target){
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] temp=s.split(" ");
        int[] num=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            num[i]=Integer.parseInt(temp[i]);
        }
        int targe= sc.nextInt();
        System.out.println(searchInsert(num,targe));
    }
}
