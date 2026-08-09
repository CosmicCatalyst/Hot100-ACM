package TOP60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuLanDeJuZi {
    public static int[][] dic={{-1,0},{1,0},{0,-1},{0,1}};
    public static int orangesRotting(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        List<int[]> q=new ArrayList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    fresh++;
                }else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        while(fresh>0&&!q.isEmpty()){
            ans++;
            List<int[]> temp=q;
            q=new ArrayList<>();
            for(int[] pos:temp){
                for(int[] d:dic){
                    int x=pos[0]+d[0];
                    int y=pos[1]+d[1];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        grid[x][y]=2;
                        fresh--;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        return fresh>0?-1:ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hang=sc.nextInt();
        int lei=sc.nextInt();
        sc.nextLine();
        int[][] chere=new int[hang][lei];
        for(int i=0;i<hang;i++){
            for(int j=0;j<lei;j++){
                chere[i][j]=sc.nextInt();
            }
        }
        System.out.println(orangesRotting(chere));
    }
}
