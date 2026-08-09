package TOP80;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ZhuZhuangTuZhongZuiDaDeJuZhen {
    public static int largestRectangleArea(int[] heights){
        int ans=0;
        int[] newheight=new int[heights.length+2];
        newheight[0]=0;
        System.arraycopy(heights,0,newheight,1,heights.length);
        newheight[heights.length+1]=0;
        heights=newheight;
        Deque<Integer> deque=new ArrayDeque<>();
        deque.push(0);
        for(int i=1;i<heights.length;i++){
            while (heights[i]<heights[deque.peek()]){
                int curheight=heights[deque.pop()];
                int curweight=i-deque.peek()-1;
                ans=Math.max(ans,curheight*curweight);
            }
            deque.push(i);
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
        System.out.println(largestRectangleArea(num));
    }
}
