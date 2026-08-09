package TOP100;

import java.util.Scanner;

public class XunZhaoChongFuShu {
    public static int findDuplicate(int[] nums){
        int fast=0;
        int slow=0;
        while (true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(fast==slow){
                break;
            }
        }
        int head=0;
        while (slow!=head){
            slow=nums[slow];
            head=nums[head];
        }
        return slow;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(findDuplicate(nums));
    }
}
