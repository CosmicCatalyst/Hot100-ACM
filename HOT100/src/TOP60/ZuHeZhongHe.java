package TOP60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZuHeZhongHe {
   static List<List<Integer>> ans=new ArrayList<>();
   static List<Integer> path=new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        back(candidates,target,0,0);
        return ans;
    }
    public static void back(int[] candidates,int targer,int sum,int start){
        if(sum==targer){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(sum+candidates[i]>targer){
                break;
            }
            path.add(candidates[i]);
            back(candidates,targer,sum+candidates[i],i);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] c=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            c[i]=Integer.parseInt(strings[i]);
        }
        int targt= sc.nextInt();
        System.out.println(combinationSum(c,targt));
    }
}
