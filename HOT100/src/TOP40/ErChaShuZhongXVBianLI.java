package TOP40;

import java.util.*;

public class ErChaShuZhongXVBianLI {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

        public static List<Integer> inorderTraversal(TreeNode node) {
            List<Integer> arr = new ArrayList<>();
            inorder(arr, node);
            return arr;
        }

        public static void inorder(List<Integer> arr, TreeNode node) {
            if (node == null) return;
            inorder(arr, node.left);
            arr.add(node.val);
            inorder(arr, node.right);
        }
    public static TreeNode buildTree(String[] nodes){
//        // ① 空树判断
//        if(nodes==null || nodes.length==0 || nodes[0].equals("null")){
//            return null;
//        }
// ② 创建根节点并初始化队列
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;  // 从第二个元素开始处理
// ③ BFS 构建
        while(!queue.isEmpty() && index < nodes.length){
            TreeNode cur = queue.poll();  // 取出当前父节点
            // 处理左子节点
            if(index < nodes.length && !nodes[index].equals("null")){
                cur.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(cur.left);  // 非空节点入队
            }
            index++;  // 移动到右子节点位置
            // 处理右子节点
            if(index < nodes.length && !nodes[index].equals("null")){
                cur.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(cur.right);
            }
            index++;  // 移动到下一个父节点的子节点位置
        }
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root =buildTree(strings);
        List<Integer> ans=inorderTraversal(root);
        System.out.println(ans);
    }
}
