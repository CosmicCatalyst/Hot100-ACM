package TOP40;

import java.util.HashMap;
import java.util.Map;

public class SuiJILianBiaoFuZhi {
    public static class Node{
        int val;
        Node next;
        Node random;
        public Node(int x){
            val=x;
            next=null;
            random=null;
        }
    }
    public static Node copyRandomList(Node head){
        Map<Node,Node> map=new HashMap<>();
        Node per=head;
        while(per!=null){
            map.put(per,new Node(per.val));
            per=per.next;
        }
        Node temp=head;
        while(temp!=null){
            Node cloae=map.get(temp);
            cloae.next=map.get(temp.next);
            cloae.random=map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }
    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;
        Node copyNode=copyRandomList(node1);
        while(copyNode!=null){
            System.out.println(copyNode+" "+copyNode.val);
            copyNode=copyNode.next;
        }
        System.out.println("===================");
        while (node1!=null){
            System.out.println(node1+" "+node1.val);
            node1=node1.next;
        }
    }
}
