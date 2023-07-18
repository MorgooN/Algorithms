// O(N) complexity

public class Factorial {

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            System.out.println("Cannot calculate negative factorial");
            return n;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int x = 7;
        int n = factorial(x);
        System.out.println(n);
    }
}