package TOP50;

import java.util.*;

public class YouXvShuZuZhuanHuanWeiErChaSouSuoShu {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode sortedArrayToBST(int[] nums){
        return sort(nums,0,nums.length-1);
    }
    public static TreeNode sort(int[] nums,int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sort(nums,left,mid-1);
        root.right=sort(nums,mid+1,right);
        return root;
    }
    public static List<Integer> cengxv(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                ans.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int[] nums=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        TreeNode root=sortedArrayToBST(nums);
        System.out.println(cengxv(root));
    }
}
