public class deletein_BST {

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
    public static Node delete(Node root,int val)
    {
        if(root.data>val) 
        root.left=delete(root.left,val);

        else if(root.data<val) 
        root.right=delete(root.right,val);

        else{
            if(root.left==null && root.right==null)
            return null;

            if(root.right==null)
            return root.left;

            else if(root.right==null)
            return root.left;

            else 
            {
                Node IS=successor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
            }    
        }
        return root;
    }

        public static Node successor(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
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

        delete(root, 4);
        System.out.println();
        inorder(root);

    }
}


