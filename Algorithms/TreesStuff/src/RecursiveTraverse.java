// Another name for the Recursive Search is DFS
// Time complexity O(N) where N - number of nodes
// REVERSE

// class for saving/creating nodes
class Node{
    Node left,right;
    int data;

    // creating new node with some data in it
    Node(int key){
        data = key;
        left = right = null;
    }
}

public class RecursiveTraverse {

    // recursive function to traverse tree
    static void postOrder(Node root){

        // if current node is empty - return
        if(root == null){
            return;
        }

      
        postOrder(root.right); // Traverse right
        postOrder(root.left); // Traverse left



        System.out.print(root.data + " "); // printing data stored in node
    }

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node (8);

        postOrder(root);

          /* Tree created
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

    }
}
