package TOP50;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ErChaShuZhongZuiDaLuJingHe {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }

    }
    static int maxsum=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root){
        if(root==null) return 0;
        maxGet(root);
        return maxsum;
    }
    public static int maxGet(TreeNode root){
        if(root==null) return 0;
        int maxleft=Math.max(maxGet(root.left),0);
        int maxright=Math.max(maxGet(root.right),0);
        maxsum=Math.max(maxsum,root.val+maxleft+maxright);
        return Math.max(maxleft,maxright)+root.val;
    }
    public static TreeNode builderTree(String[] strings){
        TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        int index=1;
        queue.add(root);
        while (index<strings.length&&!queue.isEmpty()){
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=builderTree(strings);
        System.out.println(maxPathSum(root));
    }
}
