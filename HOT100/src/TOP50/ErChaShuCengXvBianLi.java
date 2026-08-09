package TOP50;

import java.util.*;

public class ErChaShuCengXvBianLi {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> path=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                path.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            ans.add(path);
        }
        return ans;
    }
    public static TreeNode builderTree(String[] strings){
        TreeNode root=new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int index=1;
        while(index< strings.length&&!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if(index<strings.length&&!strings[index].equals("null")){
                cur.left=new TreeNode(Integer.parseInt(strings[index]));
                queue.add(cur.left);
            }
            index++;
            if(index< strings.length&&!strings[index].equals("null")){
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
        System.out.println(levelOrder(root));
    }
}
