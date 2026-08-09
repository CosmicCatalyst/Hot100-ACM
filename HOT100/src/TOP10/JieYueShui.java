package TOP10;

import java.util.Scanner;

public class JieYueShui {
    public static int trap(int[] height){
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int ans=Math.min(left[i],right[i])-height[i];
            sum+=ans;
        }
        return  sum;
    }
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(trap(nums));
    }
}
