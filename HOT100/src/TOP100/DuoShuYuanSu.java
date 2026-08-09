package TOP100;

import java.util.Scanner;

public class DuoShuYuanSu {
    public static int majorityElement(int[] nums){
        int x=0,p=0;
        for(int num:nums){
            if(p==0){
                x=num;
            }
            if(num==x){
                p++;
            }else{
                p--;
            }
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        int[] num=new int[strings.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(majorityElement(num));
    }
}
