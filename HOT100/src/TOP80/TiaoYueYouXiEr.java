package TOP80;

import java.util.Scanner;

public class TiaoYueYouXiEr {
    public static int jump(int[] nums){
        int ans=0;
        int curright=0;
        int nextright=0;
        for(int i=0;i<nums.length-1;i++){
            nextright=Math.max(nextright,nums[i]+i);
            if(i==curright){
                curright=nextright;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(jump(num));
    }
}
