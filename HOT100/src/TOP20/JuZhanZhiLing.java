package TOP20;

import java.util.Arrays;
import java.util.Scanner;

public class JuZhanZhiLing {
    public static void setZeroes(int[][] matrix){
        boolean[] hang=new boolean[matrix.length];
        boolean[] lei=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    hang[i]=true;
                    lei[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(hang[i]||lei[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
         int[][] test=new int[n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 test[i][j]= sc.nextInt();
             }
         }
         setZeroes(test);
         System.out.println(Arrays.deepToString(test));
    }
}
