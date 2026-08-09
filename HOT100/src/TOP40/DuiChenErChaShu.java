package TOP40;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DuiChenErChaShu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode buildeTree(String[] strings){
        TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int index=1;
        while(!queue.isEmpty()&&index<strings.length){
            TreeNode cur=queue.poll();
            if(index<strings.length&&!strings[index].equals("null")){
                cur.left=new TreeNode(Integer.parseInt(strings[index]));
                queue.add(cur.left);
            }
            index++;
            if(index<strings.length&&!strings[index].equals("null")){
                cur.right=new TreeNode(Integer.parseInt(strings[index]));
                queue.add(cur.right);
            }
            index++;
        }
        return root;
    }
    public static boolean isSymmetric(TreeNode root){
        if(root==null) return true;
        return is(root.left,root.right);
    }
    public static boolean is(TreeNode left,TreeNode right){
        if(left!=null&&right==null) return false;
        if(left==null&&right!=null) return false;
        if(left==null&&right==null) return true;
        if(left.val!=right.val) return false;
        boolean com1=is(left.left,right.right);
        boolean com2=is(left.right,right.left);
        return com1&&com2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();;
        String[] strings=s.split(" ");
        TreeNode root=buildeTree(strings);
        System.out.println(isSymmetric(root));
    }
}
