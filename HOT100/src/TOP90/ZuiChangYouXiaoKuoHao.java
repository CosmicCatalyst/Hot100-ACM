package TOP90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZuiChangYouXiaoKuoHao {
    public static int longestValidParentheses(String s){
        List<Integer> stk=new ArrayList<>();
        stk.add(-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.add(i);
            }else if(stk.size()>1){
                stk.remove(stk.size()-1);
                ans=Math.max(ans,i-stk.get(stk.size()-1));
            }else{
                stk.set(0,i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(longestValidParentheses(s));
    }
}
