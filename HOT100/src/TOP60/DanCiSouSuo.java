package TOP60;

import java.util.Scanner;

public class DanCiSouSuo {
    public static int[][] dic={{0,1},{0,-1},{1,0},{-1,0}};
    public static boolean exist(char[][] board, String word){
        char[] w=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(i,j,0,board,w)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i,int j,int k,char[][] board,char[] w){
        if(board[i][j]!=w[k]){
            return false;
        }
        if(k==w.length-1){
            return true;
        }
        board[i][j]=0;
        for(int[] d:dic){
            int x=i+d[0];
            int y=j+d[1];
            if(x>=0&&x<board.length&&y>=0&&y<board[x].length&&dfs(x,y,k+1,board,w)){
                return true;
            }
        }
        board[i][j]=w[k];
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        char[][] b=new char[m][n];
        sc.nextLine();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextLine().charAt(0);
            }
        }
        String w=sc.nextLine();
        System.out.println(exist(b,w));
    }
}
