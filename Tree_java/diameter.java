// longest path between two nodes    
// the tree looks like this
//        1
//      /   \
//     2     3
//    / \     \
//   4   5     6
import java.util.*;
public class diameter {
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

    public static int Height(Node root)
    {
        if(root==null)
        return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return (Math.max(leftHeight, rightHeight)+1);
    }

    public static int diameter(Node root)    //TC - O(n*n);
    {
        if(root==null)
        return 0;

        int dia1= diameter(root.left);
        int dia2 = diameter(root.right);

        int dia3=Height(root.left)+Height(root.right)+1;
        
        return (Math.max(dia3,Math.max(dia1,dia2)));
    }

    public static void main(String[] args)
    {
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root=tree.buildtree(Nodes);

        System.out.println(diameter(root));
    }
}

