package TOP90;

import java.util.Scanner;

public class PaLouTi {
    public static int climbStairs(int n){
        int[] f=new int[46];
        f[0]=f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(climbStairs(n));
    }

}
