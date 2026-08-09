package TOP40;

import java.util.HashMap;
import java.util.Map;

public class LRUHuanCun {
    public  static class LRUCache{
        public static class Node{
            int key,value;
            Node per,next;
            public Node(int k,int v){
                key=k;
                value=v;
            }
        }
        public final int capacity;
        public final Node dummy=new Node(0,0);
        public final Map<Integer,Node> keyToMap=new HashMap<>();
        public LRUCache(int capacity){
            this.capacity=capacity;
            dummy.per=dummy;
            dummy.next=dummy;
        }
        public int get(int key){
            Node node=getNode(key);
            return node==null?-1: node.value;
        }
        public Node getNode(int key){
            if(!keyToMap.containsKey(key)){
                return null;
            }
            Node node=keyToMap.get(key);
            remove(node);
            putFirst(node);
            return node;
        }
        public void remove(Node x){
            x.per.next=x.next;
            x.next.per=x.per;
        }
        public void putFirst(Node x){
            x.per=dummy;
            x.next=dummy.next;
            dummy.next.per=x;
            dummy.next=x;
        }
        public void put(int k,int v){
            Node node=getNode(k);
            if(node!=null){
                node.value=v;
                return;
            }
            node=new Node(k,v);
            keyToMap.put(k,node);
            putFirst(node);
            if(keyToMap.size()>capacity){
                keyToMap.remove(dummy.per.key);
                remove(dummy.per);
            }
        }
    }
    public static void main(String[] args){
        LRUCache lruCache=new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(2));
        lruCache.put(3,3);
        System.out.println(lruCache.get(1));
    }
}
