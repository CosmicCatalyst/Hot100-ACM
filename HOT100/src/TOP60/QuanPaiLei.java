package TOP60;

import java.util.*;

public class QuanPaiLei {
   static List<List<Integer>> ans=new ArrayList<>();
  static List<Integer> path=new LinkedList<>();
  static boolean[] used;
    public static List<List<Integer>> permute(int[] nums){
        used=new boolean[nums.length];
        Arrays.fill(used,false);
        brok(nums);
        return ans;
    }
    public static void brok(int[] num){
        if(path.size()==num.length){
            ans.add(new LinkedList<>(path));
        }
        for(int i=0;i<num.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            path.add(num[i]);
            brok(num);
            path.removeLast();
            used[i]=false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        permute(num);
        System.out.println(ans);
    }
}
