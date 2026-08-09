package TOP40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HeBingKGeShengXv {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists){
        return merge(lists,0,lists.length-1);
    }
    public static ListNode merge(ListNode[] list, int l, int r){
        if(l==r) return list[l];
        if(l>r) return null;
        int mid=(l+r)/2;
        return mergrTow(merge(list,l,mid),merge(list,mid+1,r));
    }
    public static ListNode mergrTow(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode per=dummy;
        while(l1!=null&&l2!=null){
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
        int k= sc.nextInt();
       ListNode[] list=new ListNode[k];
       sc.nextLine();//吸收空格
       for(int i=0;i<k;i++){
           String s=sc.nextLine();
           String[] strings=s.split(" ");
           ListNode node=new ListNode(Integer.parseInt(strings[0]));
           list[i]=node;
           ListNode cur=node;
           for(int j=1;j<strings.length;j++){
               cur.next=new ListNode(Integer.parseInt(strings[j]));
               cur=cur.next;
           }
       }
       ListNode ans=mergeKLists(list);
       while (ans!=null){
           System.out.println(ans.val);
           ans= ans.next;
       }
    }
}
