package TOP80;

import java.util.*;

public class QianKGeGaoPinYuanSu {
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((p1,p2)->p2[1]-p1[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(topKFrequent(num,k)));
    }
}
