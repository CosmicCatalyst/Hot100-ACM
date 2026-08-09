package TOP60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DianHuaHaoMaDeZiMuZuHe {
   static List<String> ans=new ArrayList<>();
   static StringBuilder sb=new StringBuilder();
    public static List<String> letterCombinations(String digits){
        String[] nums={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        back(digits,nums,0);
        return ans;
    }
    public static void back(String digits,String[] nums,int start){
        if(start==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String str=nums[digits.charAt(start)-'0'];
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            back(digits,nums,start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        System.out.println(letterCombinations(t));
    }

}
