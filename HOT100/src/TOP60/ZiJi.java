package TOP60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ZiJi {
    static List<List<Integer>> ans=new ArrayList<>();
    static List<Integer> path=new LinkedList<>();
    public static List<List<Integer>> subsets(int[] nums){
        back(nums,0);
        return ans;
    }
    public static void back(int[] nums,int start){
        ans.add(new LinkedList<>(path));
        if(start== nums.length) return;
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            back(nums,i+1);
            path.removeLast();
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        subsets(num);
        System.out.println(ans);
    }
}
