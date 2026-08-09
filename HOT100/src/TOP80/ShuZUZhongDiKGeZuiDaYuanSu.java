package TOP80;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShuZUZhongDiKGeZuiDaYuanSu {
    public static int findKthLargest(int[] nums, int k){
        List<Integer> list=new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        return kuaipai(list,k);
    }
    public static int kuaipai(List<Integer> list,int k){
        Random r=new Random();
        int p=list.get(r.nextInt(list.size()));
        List<Integer> big=new ArrayList<>();
        List<Integer> small=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        for(int num:list){
            if(num>p){
                big.add(num);
            }else if(num<p){
                small.add(num);
            }else {
                equal.add(num);
            }
        }
        if(k<=big.size()){
            return kuaipai(big,k);
        }
        if(list.size()-small.size()<k){
            return kuaipai(small,k-list.size()+small.size());
        }
        return p;
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
        System.out.println(findKthLargest(num,k));
    }
}
