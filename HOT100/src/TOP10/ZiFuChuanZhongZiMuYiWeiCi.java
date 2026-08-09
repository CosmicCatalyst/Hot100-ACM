package TOP10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZiFuChuanZhongZiMuYiWeiCi {
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()){
            return  ans;
        }
        int[] scount=new int[128];
        int[] pcount=new int[128];
        for(int i=0;i<p.length();i++){
            scount[s.charAt(i)]++;
            pcount[p.charAt(i)]++;
        }
        if(Arrays.equals(scount,pcount)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            scount[s.charAt(i)]++;
            scount[s.charAt(i-p.length())]--;
            if(Arrays.equals(scount,pcount)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String p=sc.nextLine();
        System.out.println(findAnagrams(s,p));
    }
}
