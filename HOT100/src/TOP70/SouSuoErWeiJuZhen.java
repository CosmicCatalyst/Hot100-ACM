package TOP70;

import java.util.Scanner;

public class SouSuoErWeiJuZhen {
    public static boolean searchMatrix(int[][] matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while (l<=r){
            int mid=(l+r)/2;
            int x=matrix[mid/n][mid%n];
            if(x==target){
                return true;
            }else if(x<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] juzhen=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                juzhen[i][j]= sc.nextInt();
            }
        }
        int targe= sc.nextInt();
        System.out.println(searchMatrix(juzhen,targe));
    }
}
