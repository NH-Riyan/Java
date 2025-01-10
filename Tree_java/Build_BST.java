///building a BST
public class Build_BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
}

    public static Node insert(Node root,int val)
    {
        if(root ==null)
        {
            root=new Node(val);
            return root;
        }

        else if(root.data>val)
        {
            root.left=insert(root.left, val);
        }
        else root.right=insert(root.right, val);

        return root;
    }
//if we use inorder traversal on a BST then it will give me a sorted tree 
    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");     
        inorder(root.right);
    }

    public static void main(String[] args)
    {
        int node[]={5,1,3,2,4,7};
        Node root=null;

        for(int i=0;i<node.length;i++)
        {
            root=insert(root, node[i]);
        }
        inorder(root);

    }
}
