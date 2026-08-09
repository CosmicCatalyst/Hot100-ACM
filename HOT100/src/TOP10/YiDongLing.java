package TOP10;

import java.util.Arrays;
import java.util.Scanner;

public class YiDongLing {
    public static void moveZeroes(int[] nums){
        int slow=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[slow]=nums[i];
                slow++;
            }
        }
        for(;slow<nums.length;slow++){
            nums[slow]=0;
        }
        return;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String strings=sc.nextLine();
        String[] s=strings.split(" ");
        int[] input=new int[s.length];
        for(int i=0;i<input.length;i++){
            input[i]=Integer.parseInt(s[i]);
        }
        moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }
}
