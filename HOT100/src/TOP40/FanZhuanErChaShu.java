package TOP40;

import java.util.*;

public class FanZhuanErChaShu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode invertTree(TreeNode root){
        if(root==null){
            return  null;
        }
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static TreeNode buildTree(String[] s) {
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;
        while (!queue.isEmpty() && index < s.length) {
            TreeNode cur = queue.poll();
            if (index < s.length && !s[index].equals("null")) {
                cur.left = new TreeNode(Integer.parseInt(s[index]));
                queue.offer(cur.left);
            }
            index++;
            if (index < s.length && !s[index].equals("null")) {
                cur.right = new TreeNode(Integer.parseInt(s[index]));
                queue.offer(cur.right);
            }
            index++;
        }
        return root;
    }
    public static List<Integer> inorder(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        in(ans,root);
        return ans;
    }
    public static void in(List<Integer> ans,TreeNode root){
        if(root==null){
            return;
        }
        in(ans,root.left);
        ans.add(root.val);
        in(ans,root.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=buildTree(strings);
        System.out.println(inorder(root));
        TreeNode temp=invertTree(root);
        System.out.println(inorder(temp));
    }
}
