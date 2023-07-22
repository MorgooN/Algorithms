import java.util.*;
// Here covered the net(graph) creation
// and traversal algorithms

// class where we create and set nodes.
// ArrayList is chosen instead of LinkedList
// because of his O(1) adding and getting element complexity
class Nodes{
    int value;
    List<Nodes> neighbors;

    Nodes(int value){
        this.value = value;
        neighbors = new ArrayList<>();
    }

    public void addEdge(Nodes to){
        neighbors.add(to);
    }
}

public class TraverseAlgorithms {

    public static void main(String args[]){

        Nodes n0 = new Nodes(0);
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);

        n0.addEdge(n1);
        n1.addEdge(n0);
        n1.addEdge(n3);
        n1.addEdge(n2);
        n2.addEdge(n1);
        n2.addEdge(n4);
        n3.addEdge(n1);
        n3.addEdge(n4);
        n3.addEdge(n5);
        n4.addEdge(n2);
        n4.addEdge(n3);
        n5.addEdge(n3);



        System.out.println("BFS-Iterative style ");
        bfs(n0);

        System.out.println(" DFS-Iterative style ");
        dfsIterative(n0);

        System.out.println(" DFS-Iterative style ");
        dfsRecursive(n0, new HashSet<Integer>());


    }


    // In BFS, we're using the queue to traverse the net (aka graph)
    // As long as the queue is not empty, the node is removed, and
    // it continues to add unvisited
    // neighbors nodes into queue.
    // the Set is used here to keep track of all
    // visited nodes, since graph may contain cycles,
    // and we only want to add unvisited nodes into the queue
    static void bfs(Nodes startNode){
            //If you declare a Queue (left-hand, interface) and instantiate it with a LinkedList (right-hand, class),
            // you'll only have the Queue operations, not the List methods.
            Queue<Nodes> q1 = new LinkedList<>();       // Queue to traverse the graph
            Set<Integer> visited = new HashSet<>();    // set for storing the visited nodes
            q1.add(startNode);
            visited.add(startNode.value);

            while(!q1.isEmpty()){
                Nodes currentNode = q1.remove();
                System.out.println(currentNode.value);

                for(Nodes n: currentNode.neighbors){    // dealing with the neighbors
                    if(!visited.contains(n.value)){     // graph may contain loops, and we want only unique values
                        q1.add(n);                      // so we're checking for a uniqueness and if true adding the value
                        visited.add(n.value);
                    }
                }
            }
    }

    // DFS uses a stack instead of queue to traverse the graph. A start node is pushed to the stack.
    // As long as the stack is not empty, a node is popped, and its unvisited neighbors are added to the stack
    // The graph is traversed in-depth because the node that is popped off the stack is the most recently pushed.
    // Just like in BFS, a visited set is used
    static void dfsIterative(Nodes startNode){
        Stack<Nodes> s = new Stack<>();
        Set<Integer> visitors = new HashSet<>();     // Using HashSet for constant time performance for basic operations
        s.push(startNode);
        visitors.add(startNode.value);

        while(!s.isEmpty()){
            Nodes currNode = s.pop();
            System.out.println(currNode.value);

            
            for(Nodes n: currNode.neighbors){
                if(!visitors.contains(n.value)){ // As in BFS graph may contain loops, and we want only unique values
                    s.push(n);
                    visitors.add(n.value);
                }
            }
        }
    }

    static void dfsRecursive(Nodes startNode, Set<Integer> visitors){
        System.out.println(startNode.value);
        visitors.add(startNode.value);

        for(Nodes n: startNode.neighbors){
            if(!visitors.contains(n.value)){   // Same as iterative DFS graph may contain loops, and we want only unique values
                dfsRecursive(n, visitors);
            }
        }
    }
    
}


