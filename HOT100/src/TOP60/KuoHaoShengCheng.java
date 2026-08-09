package TOP60;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KuoHaoShengCheng {
   static int n;
   static List<String> ans=new ArrayList();
   static char[] path;
    public static List<String> generateParenthesis(int n){
        KuoHaoShengCheng.n=n;
        path=new char[n*2];
        back(0,0);
        return ans;
    }
    public static void back(int i,int open){
        if(i==n*2){
            ans.add(new String(path));
            return;
        }
        if(open<n){
            path[i]='(';
            back(i+1,open+1);
        }
        if(i-open<open){
            path[i]=')';
            back(i+1,open);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(generateParenthesis(n));
    }
}
