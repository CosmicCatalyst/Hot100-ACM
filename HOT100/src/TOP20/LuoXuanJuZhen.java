package TOP20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuoXuanJuZhen {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans=new ArrayList<>();
        int shang=0;
        int xia=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(shang<=xia&&left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[shang][i]);
            }
            shang++;
            for(int i=shang;i<=xia;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(shang<=xia){
                for (int i=right;i>=left;i--){
                    ans.add(matrix[xia][i]);
                }
                xia--;
            }
            if(left<=right){
                for(int i=xia;i>=shang;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int[][] test=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                test[i][j]=sc.nextInt();
            }
        }
        System.out.println(spiralOrder(test));
    }
}
