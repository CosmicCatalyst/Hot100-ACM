package TOP20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeBingQuJian1111DeepToString {
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(p,q)->p[0]-q[0]);
        List<int[]> ans=new ArrayList<>();
        for(int[] p:intervals){
            int m=ans.size();
            if(m>0&&p[0]<=ans.get(m-1)[1]){
                ans.get(m-1)[1]=Math.max(ans.get(m-1)[1],p[1]);
            }else{
                ans.add(p);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] num=new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0]= sc.nextInt();
            num[i][1]=sc.nextInt();
        }
        System.out.println(Arrays.deepToString(merge(num))); //多维数组输出字符串的函数——deepToString
    }
}
