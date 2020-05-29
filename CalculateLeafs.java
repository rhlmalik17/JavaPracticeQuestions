public class CalculateLeafs
{
    TreeNode head;
    int count=0;
    class TreeNode{
        int data;
        TreeNode leftNode;
        TreeNode rightNode;
        public TreeNode(int data)
        {
            this.data=data;
            leftNode=null;
            rightNode=null;
        }
    }
    public void createTree()
    {
        head=new TreeNode(5);
        head.leftNode=new TreeNode(2);
        head.leftNode.leftNode=new TreeNode(5);
        head.leftNode.rightNode=new TreeNode(4);

        head.rightNode=new TreeNode(3);
        head.rightNode.rightNode=new TreeNode(6);
    }
    public void calculateleafs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.rightNode==null && root.leftNode==null)
        {
            count++;
        }
        calculateleafs(root.leftNode);
        calculateleafs(root.rightNode);
    }
    public int SumOfLeafs(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.leftNode==null && root.rightNode==null)
        {
            return root.data;
        }
        return SumOfLeafs(root.leftNode)+SumOfLeafs(root.rightNode);
    }
    public int getLeafNodes()
    {
        return count;
    }
    public static void main(String args[])
    {
        CalculateLeafs obj = new CalculateLeafs();
        obj.createTree();
        // obj.calculateleafs(obj.head);
        
        System.out.println(obj.SumOfLeafs(obj.head));

    }
}