package TOP10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LiangShuZhiHe {
        public static int[] towSum(int[] nums,int target){
            int[] arr=new int[2];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    arr[1]=i;
                    arr[0]=map.get(target-nums[i]);
                }
                map.put(nums[i],i);
            }
            return arr;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String line=sc.nextLine();
            int target=sc.nextInt();
            String[] split=line.split(" ");
            int[] nums=new int[split.length];
            for(int i=0;i<split.length;i++){
                nums[i]=Integer.parseInt(split[i]);
            }
            System.out.println(Arrays.toString(towSum(nums,target)));
        }
    }
