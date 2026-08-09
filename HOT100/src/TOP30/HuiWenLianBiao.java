package TOP30;

import java.util.Scanner;

public class HuiWenLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode per=null;
        ListNode cur=slow;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=per;
            per=cur;
            cur=temp;
        }
        ListNode A=head;
        ListNode B=per;
        while(B!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] text=s.split(" ");
        ListNode head=new ListNode(Integer.parseInt(text[0]));
        ListNode temp=head;
        for(int i=1;i< text.length;i++){
            head.next=new ListNode(Integer.parseInt(text[i]));
            head=head.next;
        }
        System.out.println(isPalindrome(temp));
    }
}
