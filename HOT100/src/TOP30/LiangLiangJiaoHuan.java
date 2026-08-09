package TOP30;

import java.util.Scanner;

public class LiangLiangJiaoHuan {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode swapPairs(ListNode head){
        ListNode cur=new ListNode(0);
        cur.next=head;
        ListNode per=cur;
        ListNode temp1;
        ListNode temp2;
        while(cur.next!=null&&cur.next.next!=null){
            temp1=cur.next;
            temp2=cur.next.next;
            cur.next=temp2;
            temp1.next=temp2.next;
            temp2.next=temp1;
            cur=temp1;
        }
        return  per.next;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        ListNode head=new ListNode(Integer.parseInt(strings[0]));
        ListNode per=new ListNode(0);
        per.next=head;
        for(int i=1;i<strings.length;i++){
            head.next=new ListNode(Integer.parseInt(strings[i]));
            head=head.next;
        }
        per=swapPairs(per.next);
        while (per!=null){
            System.out.println(per.val);
            per=per.next;
        }
    }
}
