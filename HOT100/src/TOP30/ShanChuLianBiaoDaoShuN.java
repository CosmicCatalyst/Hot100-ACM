package TOP30;

import java.util.Scanner;

public class ShanChuLianBiaoDaoShuN {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=head;
        ListNode slow=dummy;
        while(n>0){
            fast=fast.next;
            n--;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        ListNode head=new ListNode(Integer.parseInt(strings[0]));
        ListNode cur=head;
        for(int i=1;i<strings.length;i++){
            head.next=new ListNode(Integer.parseInt(strings[i]));
            head=head.next;
        }
        int x=sc.nextInt();
       cur=removeNthFromEnd(cur,x);
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
