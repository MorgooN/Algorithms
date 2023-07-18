import java.util.Stack;
// REVERSE
// Time complexity O(N) where N - number of nodes

 class NodeIS{
    int data;
    NodeIS left, right;

    NodeIS(int key){
        data = key;
        left=right=null;
    }

        }

public class IterativeSearch {
     static void postOrderIterative(NodeIS root){

         if(root == null){
             return;
         }

         Stack<NodeIS> s1 = new Stack<>(); // push root into empty stack
         s1.push(root);

         Stack<Integer> out = new Stack<>(); // saving the traverse order

         while(!s1.empty()){
             // extract the current root and push it into out-stack
             NodeIS curr = s1.pop();
             out.push(curr.data);

             // if left and right child of the extracted node is not empty we push it into stack
             if(curr.left != null){
                s1.push(curr.left);
             }

             if(curr.right != null){
                 s1.push(curr.right);
             }
         }

         while(!out.empty()){
             System.out.print(" " + out.pop());
         }

     }

     public static void main(String args[]){
         NodeIS root = new NodeIS(1);
         root.left = new NodeIS(2);
         root.right = new NodeIS(3);
         root.left.left = new NodeIS(4);
         root.right.left = new NodeIS(5);
         root.right.right = new NodeIS(6);
         root.right.left.left = new NodeIS(7);
         root.right.left.right = new NodeIS(8);

         postOrderIterative(root);
     }
}
