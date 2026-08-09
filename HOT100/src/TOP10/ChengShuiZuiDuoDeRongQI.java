package TOP10;

import java.util.Scanner;

public class ChengShuiZuiDuoDeRongQI {
    public static int maxArea(int[] height){
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int tmep=Math.min(height[left],height[right])*(right-left);
            ans=Math.max(ans,tmep);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return  ans;
    }
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        String[] strings=temp.split(" ");
        int[] text=new int[strings.length];
        for(int i=0;i<text.length;i++){
            text[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(maxArea(text));
    }
}
