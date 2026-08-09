package TOP70;

import java.util.Scanner;
import java.util.Stack;

public class YouXiaoKuoHao {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.empty()||stack.peek()!=c){
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.empty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
