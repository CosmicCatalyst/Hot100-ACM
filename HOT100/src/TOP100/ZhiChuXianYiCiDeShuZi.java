package TOP100;

import java.util.Scanner;

public class ZhiChuXianYiCiDeShuZi {
    public static int singleNumber(int[] nums){
        int temp=0;
        for(int n:nums){
            temp^=n;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] strings=s.split(" ");
        int[] asn=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            asn[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(singleNumber(asn));
    }
}
