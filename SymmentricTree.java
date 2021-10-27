class Solution {
    int count=0;
    boolean same=false;
    public boolean isSymmetric(TreeNode root) {
        helper(root.left,root.right);
        if(count>0){
            same=false;
        }
        return same;
    }
    public void helper(TreeNode t1,TreeNode t2){
        
        if(t1==null && t2==null)
        {
            same=true;
            return;
        }
        if(t1!=null && t2!=null && t1.val==t2.val)
        {
            same=true;
            helper(t1.left,t2.right);
            helper(t2.left,t1.right);
        }else{
            count++;
            same=false;
            return;
        }
    }
}
