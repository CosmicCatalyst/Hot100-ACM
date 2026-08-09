package TOP40;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZuiDaShenDu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static int maxDepth(TreeNode root){
        return get(root);
    }
    public static int get(TreeNode root){
        if(root==null) return 0;
        int leftmax=get(root.left);
        int rightmax=get(root.right);
        return 1+Math.max(leftmax,rightmax);
    }
    public static TreeNode buildTree(String[] s){
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int index=1;
        while(!queue.isEmpty()&&index<s.length){
            TreeNode cur=queue.poll();
            if(index<s.length&&!s[index].equals("null")){
                cur.left=new TreeNode(Integer.parseInt(s[index]));
                queue.offer(cur.left);
            }
            index++;
            if(index<s.length&&!s[index].equals("null")){
                cur.right=new TreeNode(Integer.parseInt(s[index]));
                queue.offer(cur.right);
            }
            index++;
        }
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=buildTree(strings);
        System.out.println(maxDepth(root));
    }
}
