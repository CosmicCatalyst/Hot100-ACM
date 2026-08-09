package TOP70;

import java.util.Scanner;

public class SouSuoXuanZhuanPaiXvShuZu {
    public static int search(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<=nums[end]&&target>nums[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        int targer= scanner.nextInt();
        System.out.println(search(num,targer));

    }
}
