package TOP70;

import java.util.Scanner;

public class XvZhaoXuanZhuanPaiXvShuZuMIN {
    public static int findMin(int[] nums){
        int k=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                k=i;
                break;
            }
        }
        if(k==Integer.MAX_VALUE){
            return nums[0];
        }else{
            return nums[k];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(findMin(nums));
    }
}
