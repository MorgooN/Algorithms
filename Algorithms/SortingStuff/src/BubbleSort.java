// O(N^2) complexity

public class BubbleSort {
    public static void bubbleSort(int[] arr){

        if(arr == null){
            return;
        }

        boolean swapped = true;
        int temp = 0;

        while(swapped){
            swapped = false;
            for(int i = 1; i < arr.length; ++i){
                if(arr[i] < arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        }

    }

    public static void main(String args[]){
        int[] nums = {6,232,77,313};
        bubbleSort(nums);
        for(int i = 0; i < nums.length;++i){
            System.out.println(nums[i] + " ");
        }
    }
}
