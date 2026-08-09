package TOP50;

import java.util.*;

public class CongQianXvZhongXvGouZhaoErChaShu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    static int[] pre;
    static Map<Integer,Integer> map=new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        pre=preorder;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }
    public static TreeNode recur(int rootnum,int l,int r){
        if(l>r) return null;
        TreeNode root=new TreeNode(pre[rootnum]);
        int i=map.get(pre[rootnum]);
        root.left=recur(rootnum+1,l,i-1);
        root.right=recur(rootnum+1+i-l,i+1,r);
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] num1=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            num1[i]=Integer.parseInt(strings[i]);
        }
        String s1=sc.nextLine();
        String[] strings1=s1.split(" ");
        int[] num2=new int[strings.length];
        for(int i=0;i<strings1.length;i++){
            num2[i]=Integer.parseInt(strings1[i]);
        }
        TreeNode root=buildTree(num1,num2);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<Integer> ans=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                ans.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
        }
        System.out.println(ans);
    }
}
