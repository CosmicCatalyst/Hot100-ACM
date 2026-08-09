package TOP100;

import java.util.Scanner;

public class ZuiChangHuiWenZiChuan {
    public static String longestPalindrome(String s){
        int strlen=s.length();
        int left=0,right=0,len=1,maxleft=0,maxlen=0;
        for(int i=0;i<strlen;i++){
            left=i-1;
            right=i+1;
            while (left>=0&&s.charAt(left)==s.charAt(i)){
                len++;
                left--;
            }
            while (right<strlen&&s.charAt(right)==s.charAt(i)){
                len++;
                right++;
            }
            while (left>=0&&right<strlen&&s.charAt(left)==s.charAt(right)){
                len+=2;
                right++;
                left--;
            }
            if(len>maxlen){
                maxlen=len;
                maxleft=left;
            }
            len=1;
        }
        return s.substring(maxleft+1,maxleft+1+maxlen);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
}
