// the tree looks like this
//        1
//      /   \
//     2     3
//    / \     \
//   4   5     6

import java.util.*;

public class tree_traversal {
    
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

    static class Binarytree 
    {
        static int idx=-1;
        public static Node buildtree(int nodes[])
        {
            idx++;

            if(nodes[idx]==-1)
            return null;

            Node newnode = new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
 
            return newnode;
        }
    }

    public static void preorder(Node root)
    {
        if(root==null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");     
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" "); 

    }

    public static void main(String[] args)
    {
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();

        Node root=tree.buildtree(Nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println(); 
        
    }
}

 