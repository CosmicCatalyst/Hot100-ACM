package TOP30;

import java.util.Scanner;

public class LiangShuXiangJia {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode per=new ListNode(0);
        ListNode cur=per;
        int carry=0;
        while(l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0: l2.val;
            int sum=x+y+carry;
            carry=sum/10;
            sum=sum%10;
            cur.next=new ListNode(sum);
            cur=cur.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry!=0){
            cur.next=new ListNode(carry);
        }
        return  per.next;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        ListNode l1=new ListNode(Integer.parseInt(strings[0]));
        ListNode cur=l1;
        for(int i=1;i<strings.length;i++){
            cur.next=new ListNode(Integer.parseInt(strings[i]));
            cur=cur.next;
        }
        s= sc.nextLine();
        strings=s.split(" ");
        ListNode l2=new ListNode(Integer.parseInt(strings[0]));
        ListNode temp=l2;
        for(int i=1;i<strings.length;i++){
            temp.next=new ListNode(Integer.parseInt(strings[i]));
            temp=temp.next;
        }
        ListNode node=addTwoNumbers(l1,l2);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }
}
