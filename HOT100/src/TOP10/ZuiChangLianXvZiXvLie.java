package TOP10;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ZuiChangLianXvZiXvLie {
    public  static  int longestConsecutive(int[] nums){
        int ans=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int x:set){
            if(set.contains(x-1)){
                continue;
            }
            int y=x+1;
            while(set.contains(y)){
                y++;
            }
            ans= Math.max(ans,y-x);
        }
        return ans;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        String[] nums=temp.split(" ");
        int[] test=new int[nums.length];
        for(int i=0;i<test.length;i++){
            test[i]=Integer.parseInt(nums[i]);
        }
        System.out.println(longestConsecutive(test));
    }
}
