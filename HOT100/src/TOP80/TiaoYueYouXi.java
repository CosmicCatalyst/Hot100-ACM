package TOP80;

import java.util.Scanner;

public class TiaoYueYouXi {
    public static boolean canJump(int[] nums){
        int count=0;
        for(int i=0;i<=count;i++){
            count=Math.max(count,nums[i]+i);
            if(count>=nums.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String  s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(canJump(num));
    }
}
