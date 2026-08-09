package TOP50;

import java.util.*;

public class LuJIngZongHesan {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    static int res=0;
    static Map<Long,Integer> map=new HashMap<>();
    public static int pathSum(TreeNode root, int targetSum){
        map.put(0L,1);
        traveral(root,targetSum,0L);
        return res;
    }
    public static void traveral(TreeNode root,int targetSum,Long sum){
        if(root==null) return;
        sum+=root.val;
        if(map.containsKey(sum-targetSum)){
            res+=map.get(sum-targetSum);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        traveral(root.left,targetSum,sum);
        traveral(root.right,targetSum,sum);
        map.put(sum,map.get(sum)-1);
    }
    public static TreeNode builderTree(String[] strings){
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=builderTree(strings);
        int k= sc.nextInt();
        System.out.println(pathSum(root,k));
    }
}
