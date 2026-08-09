package TOP40;

import java.util.Scanner;

public class KGeYiZuFanZhuan {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public  static ListNode reverseKGroup(ListNode head, int k){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode per=dummy;
        ListNode end=dummy;
        while(end!=null){
            for(int i=0;i<k&&end!=null;i++){
                end=end.next;
            }
            if(end==null){
                break;
            }
            ListNode start=per.next;
            ListNode next=end.next;
            end.next=null;
            per.next=rever(start);
            start.next=next;
            per=start;
            end=per;
        }
        return dummy.next;
    }
    public static ListNode rever(ListNode node){
        ListNode per=null;
        ListNode cur=node;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=per;
            per=cur;
            cur=temp;
        }
        return per;
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
        int k= sc.nextInt();
        ListNode temp=reverseKGroup(cur,k);
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
