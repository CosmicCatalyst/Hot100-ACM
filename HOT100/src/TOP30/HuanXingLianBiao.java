package TOP30;

import java.util.List;
import java.util.Scanner;

public class HuanXingLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] text=s.split(" ");
        ListNode temp=new ListNode(Integer.parseInt(text[0]));
        ListNode cur=temp;
        for(int i=1;i< text.length;i++){
            temp.next=new ListNode(Integer.parseInt(text[i]));
            temp=temp.next;
        }
        int x= sc.nextInt();
        ListNode in=cur;
        while(x>0){
            in=in.next;
            x--;
        }
        System.out.println(in.val);
        ListNode last=cur;
        while (last.next!=null){
            last=last.next;
        }
        last.next=in;
        System.out.println(hasCycle(cur));
    }
}
