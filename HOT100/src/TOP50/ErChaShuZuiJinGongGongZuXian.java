package TOP50;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ErChaShuZuiJinGongGongZuXian {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
    public static TreeNode findNode(TreeNode node,int val){
        if(node==null||node.val==val){
            return node;
        }
        TreeNode left=findNode(node.left,val);
        TreeNode right=findNode(node.right,val);
        return left==null?right:left;
    }
    public static TreeNode buildTree(String[] strings){
        TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int index=1;
        while(!queue.isEmpty()&&index<strings.length){
            TreeNode cur=queue.poll();
            if(index<strings.length&&!strings[index].equals("null")){
                cur.left=new TreeNode(Integer.parseInt(strings[index]));
                queue.offer(cur.left);
            }
            index++;
            if(index<strings.length&&!strings[index].equals("null")){
                cur.right=new TreeNode(Integer.parseInt(strings[index]));
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
        TreeNode node=buildTree(strings);
        int pVal=sc.nextInt();
        TreeNode p=findNode(node,pVal);
        int qVal=sc.nextInt();
        TreeNode q=findNode(node,qVal);
        System.out.println(lowestCommonAncestor(node,p,q).val);
    }
}
