package TOP40;

import java.util.Scanner;

public class PaiXvLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode sortList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode head2=mid(head);
        head=sortList(head);
        head2=sortList(head2);
        return paixv(head,head2);
    }
    public static ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode per=null;
        while(fast!=null&&fast.next!=null){
            per=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        per.next=null;
        return slow;
    }
    public static ListNode paixv(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode per=dummy;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                per.next=l1;
                l1=l1.next;
            }else{
                per.next=l2;
                l2=l2.next;
            }
            per=per.next;
        }
        per.next=l1!=null?l1:l2;
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        ListNode head=new ListNode(Integer.parseInt(strings[0]));
        ListNode tail=head;
        for(int i=1;i<strings.length;i++){
            head.next=new ListNode(Integer.parseInt(strings[i]));
            head=head.next;
        }

        ListNode temp=sortList(tail);
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
