
//        1
//      /   \
//     2     3
//    / \     \
//   4   5     6
import java.util.*;
public class Level_order {
        
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
  
    
    public static void levelOrder(Node root)
    {
        if(root==null) return;

        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println();

                if(q.isEmpty()) 
                break;
                else
                {
                    q.add(null);
                }
            }else{

               System.out.print(curr.data+" ");

               if(curr.left!=null)
                q.add(curr.left);

                if(curr.right!=null)
                q.add(curr.right);
            }
        }

    }


    public static void main(String[] args)
    {
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root=tree.buildtree(Nodes);

        levelOrder(root);
    }
}



