import java.util.*;

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

public class DepthFirstTraverse {

    public static void main(String args[]){

        Nodes n0 = new Nodes(0);
        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);

        System.out.println("BFS-Iterative style ");
        bfs(n0);

        System.out.println(" DFS-Iterative style ");
        dfs(0+"\n");


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
                    if(!visited.contains(n.value)){
                        q1.add(n);
                        visited.add(n.value);
                    }
                }
            }

    }
}
