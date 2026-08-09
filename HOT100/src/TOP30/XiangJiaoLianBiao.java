package TOP30;

public class XiangJiaoLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode p=headA;
        ListNode q=headB;
        while(p!=q){
            p=p!=null?p.next:headB;
            q=q!=null?q.next:headA;
        }
        return p;
    }
    public static void main(String[] args){
        ListNode head1=new ListNode(4);
        head1.next=new ListNode(1);
        head1.next.next=new ListNode(8);
        head1.next.next.next=new ListNode(4);
        head1.next.next.next.next=new ListNode(5);
        ListNode head2=new ListNode(5);
        head2.next=new ListNode(6);
        head2.next.next=new ListNode(1);
        head2.next.next.next=head1.next.next;
        System.out.println(getIntersectionNode(head1,head2).val);
    }
}
