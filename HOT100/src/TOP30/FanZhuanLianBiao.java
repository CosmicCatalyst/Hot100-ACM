package TOP30;

import java.util.Scanner;

public class FanZhuanLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode per=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=per;
            per=cur;
            cur=next;
        }
        return per;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] text=s.split(" ");
        ListNode temp=new ListNode(Integer.parseInt(text[0]));
        ListNode cur=temp;
        for(int i=1;i<text.length;i++){
            temp.next=new ListNode(Integer.parseInt(text[i]));
            temp=temp.next;
        }
        ListNode ans=reverseList(cur);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
}

