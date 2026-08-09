package TOP30;

import java.util.Scanner;

public class HuanXingLianBiao2 {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode l1=head;
                ListNode l2=slow;
                while(l1!=l2){
                    l1=l1.next;
                    l2=l2.next;
                }
                return l1;
            }
        }
        return null;
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
        ListNode last=cur;
        while(last.next!=null){
            last=last.next;
        }
        int location=sc.nextInt();
        ListNode temp=cur;
        while (location>0){
            temp=temp.next;
            location--;
        }
        last.next=temp;
        System.out.println(detectCycle(cur).val);
    }
}
