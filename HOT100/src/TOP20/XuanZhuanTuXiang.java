package TOP20;

import java.util.Arrays;
import java.util.Scanner;

public class XuanZhuanTuXiang {
    public static void rotate(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] test=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                test[i][j]= sc.nextInt();
            }
        }
        rotate(test);
        System.out.println(Arrays.deepToString(test));
    }
}