// O(logN) complexity

public class BinarySearch {

    static int binarySearch(int arr[], int l, int r, int x){


        while(r >= l){
            int mid = l+(r-l)/2;

            if(arr[mid] == x){
                return mid;
            }
            // if key (x) is smaller than the middle elem
            // in can only be present in the left part of the array
            if(arr[mid] > x){
                return binarySearch(arr,l,mid-1,x);
            }
            // if key (x) is greater than middle element, in can be present
            // only on the right side of the array
            if(arr[mid] < x) {
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = { 2, 3, 4, 10, 40,88,99,175 };
        int n = arr.length;
        int x = 98;
        int result = binarySearch(arr, 0,n-1,x );

        if(result == -1){
            System.out.println(" Key is not present in the array ");
        }
        else{
            System.out.println(" Key " + x + " is present in the array " );
        }
    }
}
