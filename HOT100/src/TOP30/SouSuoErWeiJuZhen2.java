package TOP30;

import java.util.Scanner;

public class SouSuoErWeiJuZhen2 {
    public static boolean searchMatrix(int[][] matrix, int target){
        int i=0;
        int j=matrix[0].length-1;
        while(i< matrix.length&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return  false;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] test=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                test[i][j]= sc.nextInt();
            }
        }
        int targer= sc.nextInt();
        System.out.println(searchMatrix(test,targer));
    }
}
