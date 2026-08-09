package TOP20;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class HuaDongChuangKouMax {
    public static int[] maxSlidingWindow(int[] nums, int k){
        Deque<Integer> deque=new LinkedList<>();
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        ans[0]=deque.peekFirst();
        for(int i=k;i<nums.length;i++){
            if(deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while (!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            ans[i-k+1]=deque.peekFirst();
        }
        return  ans;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String[] test=s.split(" ");
        int[] num=new int[test.length];
        for(int i=0;i<test.length;i++){
            num[i]=Integer.parseInt(test[i]);
        }
        System.out.println(Arrays.toString(maxSlidingWindow(num,k)));
    }
}
