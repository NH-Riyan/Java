public class searchin_BST {

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

    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");     
        inorder(root.right);
    }
    public static Boolean search(Node root,int val)
    {
        if(root==null)
        return false;

        if(root.data==val) return  true;

        else if(root.data>val)
        {
            return search (root.left,val);
        }
        else
            return search (root.right,val);
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
        System.out.println();
        if(search(root, 0))
        System.out.println("found");
        else 
        System.out.println("not found");

    }
}


