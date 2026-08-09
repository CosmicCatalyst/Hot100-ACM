package TOP10;

import java.util.Scanner;

public class ZuiChangWuChangFuZIChuan {
    public static int lengthOfLongestSubstring(String s){
        char[] c=s.toCharArray();
        int ans=0;
        int left=0;
        int[] cnt=new int[128];
        for(int i=0;i<c.length;i++){
            char temp=c[i];
            cnt[temp]++;
            while(cnt[temp]>1){
                cnt[c[left]]--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return  ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(text));
    }
}
