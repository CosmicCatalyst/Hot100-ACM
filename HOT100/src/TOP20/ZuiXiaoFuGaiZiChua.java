package TOP20;

import java.util.Scanner;

public class ZuiXiaoFuGaiZiChua {
    public static String minWindow(String s, String t){
        int[] cnts=new int[128];
        int[] cntt=new int[128];
        for(int i=0;i<t.length();i++){
            cntt[t.charAt(i)]++;
        }
        int left=0;
        int ansLet=-1;
        int ansRight=s.length();
        for(int i=0;i<s.length();i++){
            cnts[s.charAt(i)]++;
            while (isCover(cnts,cntt)){
                if(i-left<ansRight-ansLet){
                    ansRight=i;
                    ansLet=left;
                }
                cnts[s.charAt(left)]--;
                left++;
            }
        }
        return ansLet<0?"":s.substring(ansLet,ansRight+1);
    }
    public static   boolean isCover(int[] s,int[] t){
        for(int i='A';i<='Z';i++){
            if(s[i]<t[i]){
                return  false;
            }
        }
        for(int i='a';i<='z';i++){
            if(s[i]<t[i]){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(minWindow(s,t));
        }
    }
