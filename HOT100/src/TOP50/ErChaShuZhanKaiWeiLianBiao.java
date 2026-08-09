package TOP50;

import java.util.*;

public class ErChaShuZhanKaiWeiLianBiao {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static void flatten(TreeNode root){
        List<TreeNode> list=new ArrayList<>();
        peroeder(root,list);
        int size=list.size();
        for(int i=1;i<size;i++){
            TreeNode per=list.get(i-1);
            TreeNode curr=list.get(i);
            per.left=null;
            per.right=curr;
        }
    }
    public static void peroeder(TreeNode root,List<TreeNode> list){
        if(root!=null){
            list.add(root);
            peroeder(root.left,list);
            peroeder(root.right,list);
        }
    }
    public static TreeNode buliderTree(String[] strings){
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
        String s= sc.nextLine();
        String[] strings=s.split(" ");
        TreeNode root=buliderTree(strings);
        flatten(root);
        while (root!=null){
            System.out.println(root.val+" ");
            root=root.right;
        }
    }
}
