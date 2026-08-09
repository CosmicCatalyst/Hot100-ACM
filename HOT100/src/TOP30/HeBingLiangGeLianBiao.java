package TOP30;

import java.util.Scanner;

public class HeBingLiangGeLianBiao {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public  static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp=new ListNode(-1);
        ListNode cur=temp;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next=list1!=null?list1:list2;
        return temp.next;
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
        ListNode node=mergeTwoLists(l1,l2);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
