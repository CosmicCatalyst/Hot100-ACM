package TOP70;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FenGeHuiWenChuan {
   static List<List<String>> ans=new ArrayList<>();
   static List<String> path=new ArrayList<>();
    public static List<List<String>> partition(String s){
        back(s,0,new StringBuilder());
        return ans;
    }
    public static void back(String s,int start,StringBuilder sb){
        if(start==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<s.length();i++){
            sb.append(s.charAt(i));
            if(huiwen(sb)){
                path.add(sb.toString());
                back(s,i+1,new StringBuilder());
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean huiwen(StringBuilder sb){
        for(int i=0,j=sb.length()-1;i<j;i++,j--){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(partition(s));
    }
}
