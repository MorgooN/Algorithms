// complexity O(log(log(N))


// improvement over binary search
// "guesses" where the value might be present and if probe is incorrect
// search area is narrowed and new probe calculated
public class InterpolationSearch {

    static int interpolSearch(int[] arr, int low, int high, int target){
        int probe;

        if(low < high && target >= arr[low] && target <= arr[high]){ // border check

            probe = low + (((high - low ) * (target - arr[low]))  // calculating where are value is likely going to be
                    / (arr[high] - arr[low]));

            // conditions below same as in binary search
            if(arr[probe] == target){
                return probe;
            }

            if(arr[probe] < target){
                return interpolSearch(arr,low+1,high,target);
            }
            if(arr[probe] > target){
                return interpolSearch(arr,low,high-1,target);
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };

        int n = arr.length;

        int index = interpolSearch(arr, 0, n - 1, 121);

        // If element was found
        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }
}
