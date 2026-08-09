package TOP100;

import java.util.Arrays;
import java.util.Scanner;

public class YanSeFenLie {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int per = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[per];
                nums[per] = temp;
                per++;
            }
        }
        for (int i = per; i < n; i++) {
            if (nums[i] ==1) {
                int temp = nums[i];
                nums[i] = nums[per];
                nums[per] = temp;
                per++;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(num));
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }
}
