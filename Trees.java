

public class Trees
{
  TreeNode head;
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
        head.leftNode=new TreeNode(12);
        head.leftNode.leftNode=new TreeNode(11);
        head.leftNode.leftNode.rightNode=new TreeNode(99);
        head.leftNode.leftNode.rightNode.leftNode=new TreeNode(100);


        head.rightNode = new TreeNode(-10);
        head.rightNode.rightNode=new TreeNode(2);
        head.rightNode.leftNode=new TreeNode(1);
        head.rightNode.rightNode.rightNode=new TreeNode(80);
        head.rightNode.rightNode.rightNode.leftNode=new TreeNode(70);


    
    }
    public void createTree1()
    {
        head = new TreeNode(10);
        head.left=new TreeNode(20);
        head.rightNode=new TreeNode(30);
        head.rightNode.rightNode=new TreeNode(40);
        head.rightNode.rightNode.leftNode=new TreeNode(50);
    }
    public void initHead(int data)
    {
        head = new TreeNode(data);
    }

    public void addLeft(int data)
    {
        if(head==null)
        {
            initHead(data);
        }
        else
        {
            head.leftNode=new TreeNode(data);
        }
    }
    public void addRight(int data)
    {
        if(head==null)
        {
            initHead(data);
        }
        else
        {
            head.rightNode=new TreeNode(data);
        }
    }
    
    // public void display(TreeNode temp)
    // {
    //     if(temp==null || temp.leftNode==null && temp.rightNode==null)
    //     {
    //         return;
    //     }
    //     if(temp.data==(head.data))
    //     {
    //         System.out.println(head.data);
    //     }
    //     if(temp.leftNode!=null)
    //     System.out.print(temp.leftNode.data+" ");
    //     if(temp.rightNode!=null)
    //     System.out.print(temp.rightNode.data);
    //     System.out.println();
    //     display(temp.leftNode);
    //     display(temp.rightNode);
    // }
    
    //PRE ORDER
    public void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public static void main(String args[])
    {
       // obj.createTree();
       Trees obj = new Trees();
       obj.createTree();
        obj.preOrder(obj.head);
        
    }
}
