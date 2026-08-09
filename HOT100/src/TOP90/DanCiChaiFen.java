package TOP90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DanCiChaiFen {
    public static boolean wordBreak(String s, List<String> wordDict){
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(String word:wordDict){
                int length=word.length();
                if(i>=length&&dp[i-length]&&word.equals(s.substring(i-length,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String line=sc.nextLine();
        List<String> word=new ArrayList<>(Arrays.asList(line.split(" ")));//创建一个list
        System.out.println(wordBreak(s,word));
    }
}
