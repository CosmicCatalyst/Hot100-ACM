package TOP10;

import java.util.HashMap;
import java.util.Scanner;

public class HeWeiK {
    public  static int subarraySum(int[] nums, int k){
        int count=0,per=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            per+=nums[i];
            if(map.containsKey(per-k)){
                count+=map.get(per-k);
            }
            map.put(per,map.getOrDefault(per,0)+1);
        }
        return  count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int k= sc.nextInt();
        String[] temp=s.split(" ");
        int[] num=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            num[i]=Integer.parseInt(temp[i]);
        }
        System.out.println(subarraySum(num,k));
    }
}
