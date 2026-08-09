package TOP90;

import java.util.Arrays;
import java.util.Scanner;

public class ChengJiZuiDaZiShuZU {
    public static int maxProduct(int[] nums){
        int n=nums.length;
        int[] fmax=new int[n];
        int[] fmin=new int[n];
        fmax[0]=fmin[0]=nums[0];
        for(int i=1;i<n;i++){
            int x=nums[i];
            fmax[i]=Math.max(Math.max(fmax[i-1]*x,fmin[i-1]*x),x);
            fmin[i]=Math.min(Math.min(fmax[i-1]*x,fmin[i-1]*x),x);
        }
        return Arrays.stream(fmax).max().getAsInt();
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(maxProduct(num));
    }
}
