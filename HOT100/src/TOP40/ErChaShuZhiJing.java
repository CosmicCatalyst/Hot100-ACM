package TOP40;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ErChaShuZhiJing {
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
        while (!queue.isEmpty()&&index<strings.length){
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
    static int ans;
    public static   int diameterOfBinaryTree(TreeNode root){
        ans=1;
        shen(root);
        return ans-1;
    }
    public static int shen(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=shen(root.left);
        int r=shen(root.right);
        ans=Math.max(ans,l+r+1);
        return 1+Math.max(l,r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=buildeTree(strings);
        System.out.println(diameterOfBinaryTree(root));
    }
}
