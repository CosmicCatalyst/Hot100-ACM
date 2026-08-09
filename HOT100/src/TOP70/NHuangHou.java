package TOP70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NHuangHou {
   static List<List<String>> ans=new ArrayList<>();
    public static List<List<String>> solveNQueens(int n){
        char[][] chess=new char[n][n];
        for(char[] c:chess){
            Arrays.fill(c,'.');
        }
        dfs(0,n,chess);
        return ans;
    }
    public static void dfs(int row,int n,char[][] chess){
        if(row==n){
            List<String> path=new ArrayList<>();
            for(char[] c:chess){
                path.add(String.copyValueOf(c));
            }
            ans.add(path);
        }
        for(int col=0;col<n;col++){
            if(isvalue(row,col,n,chess)){
                chess[row][col]='Q';
                dfs(row+1,n,chess);
                chess[row][col]='.';
            }
        }
    }
    public static boolean isvalue(int row,int col,int n,char[][] chess){
        for(int i=0;i<row;i++){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        for(int j=0;j<col;j++){
            if(chess[row][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<=n-1;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solveNQueens(n));
    }

}
