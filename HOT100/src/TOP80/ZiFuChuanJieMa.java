package TOP80;

import java.util.Scanner;

public class ZiFuChuanJieMa {
    public static int index=0;
    public static String decodeString(String s){
        StringBuilder res=new StringBuilder();
        while (index<s.length()&&s.charAt(index)!=']'){
            char c=s.charAt(index);
            if(Character.isDigit(c)){
                int k=0;
                while (index<s.length()&&Character.isDigit(s.charAt(index))){
                    k=k*10+(s.charAt(index)-'0');
                    index++;
                }
                index++;
                String sb=decodeString(s);
                index++;
                for(int i=0;i<k;i++){
                    res.append(sb);
                }
            }else{
                res.append(c);
                index++;
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(decodeString(s));
    }
}
