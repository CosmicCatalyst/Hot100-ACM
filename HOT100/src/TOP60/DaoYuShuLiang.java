package TOP60;

import java.util.Scanner;

public class DaoYuShuLiang {
    public static int numIslands(char[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hang=sc.nextInt();
        int lei=sc.nextInt();
        sc.nextLine();
        char[][] chree=new char[hang][lei];
        for(int i=0;i<hang;i++){
            String s=sc.nextLine();
            for(int j=0;j<s.length();j++){
                chree[i][j]=s.charAt(j);
            }
        }
        System.out.println(numIslands(chree));
    }
}
