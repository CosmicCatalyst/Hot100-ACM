package TOP80;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MeiRiWenDu {
    public static int[] dailyTemperatures(int[] temperatures){
        int[] ans=new int[temperatures.length];
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            while (!deque.isEmpty()&&temperatures[i]>temperatures[deque.peek()]){
                ans[deque.peek()]=i-deque.pop();
            }
            deque.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] t=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            t[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(dailyTemperatures(t)));
    }
}
