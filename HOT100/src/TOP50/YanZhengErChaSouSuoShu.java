package TOP50;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class YanZhengErChaSouSuoShu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static long per=Long.MIN_VALUE;
    public static boolean isValidBST(TreeNode root){
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val<=per){
            return false;
        }
        per=root.val;
        return isValidBST(root.right);
    }
    public static TreeNode builderTree(String[] strings){
        TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int index=1;
        while(index<strings.length&&!queue.isEmpty()){
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
        System.out.println(isValidBST(root));
    }
}
