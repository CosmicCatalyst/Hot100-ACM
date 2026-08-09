package TOP60;

import java.util.Scanner;

import static TOP60.ShiXianTrie.Trie.root;

public class ShiXianTrie {
    public static class Node{
        Node[] son=new Node[26];
        boolean end;
    }
    public static class Trie {
        static Node root;

        public Trie() {
            root = new Node();
        }

        public static void insert(String word) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                c -= 'a';
                if (cur.son[c] == null) {
                    cur.son[c] = new Node();
                }
                cur = cur.son[c];
            }
            cur.end = true;
        }

        public static int find(String word) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                c -= 'a';
                if (cur.son[c] == null) {
                    return 0;
                }
                cur = cur.son[c];
            }
            return cur.end ? 2 : 1;
        }

        public static boolean search(String word) {
            return find(word) == 2;
        }

        public static boolean startsWith(String word) {
            return find(word) != 0;
        }
    }
    public static void main(String[] args){
        Trie trie=new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));

    }
}
