package TOP80;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HuaFenZiMuQuJian {
    public static List<Integer> partitionLabels(String s){
        char[] c=s.toCharArray();
        int[] last=new int[c.length];
        for(int i=0;i<c.length;i++){
            last[c[i]-'a']=i;
        }
        List<Integer> ans=new ArrayList<>();
        int start=0,end=0;
        for(int i=0;i<c.length;i++){
            end=Math.max(end,last[c[i]-'a']);
            if(end==i){
                ans.add(end-start+1);
                start=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(partitionLabels(s));
    }
}
