// Returns the maximum score the player can obtain

// depth - current depth of the game tree
// nodeIndex - index of the current node in trees
// isMax true if current move is maximizer else false
// scores[] array stores the score of the game tree
// h - maximum height of the Game tree


public class Minimax {
    static int miniMax(int depth, int nodeIndex, boolean isMax,
                       int[] scores, int h){

        if(depth == h){
            return scores[nodeIndex]; // we reached the max.height and obtain the number of scores
        }


        // if the current move is maximizer we obtain the maximum possible value and set isMax false
        if(isMax){
            return Math.max(miniMax(depth+1,nodeIndex*2,false,scores,h),
                    miniMax(depth+1,nodeIndex*2+1,false,scores,h));
        }

        // Otherwise, is current move is minimizer, we obtain the minimum value and set isMax - true
        else{
            return Math.max(miniMax(depth+1,nodeIndex*2,true,scores,h),
                    miniMax(depth+1,nodeIndex*2+1,true,scores,h));
        }
    }

    // function to find log in 2 base
    static int log2(int n){
        return (n==1)? 0:1+log2(n/2);
    }

    public static void main(String args[]){
        int scores[] = {3, 5, 2, 9, 12, 5, 23, 23};
        int n =   scores.length;
        int h = log2(n);
        int res = miniMax(0,0,true,scores,h);
        System.out.println(" Optimal value " + res);

    }


}
