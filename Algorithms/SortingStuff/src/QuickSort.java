// O(N^2) complexity

public class QuickSort {
    public static void qSort(int[] sortArr, int low, int high){
        if(sortArr.length == 0 || low >= high){
            return;
        }

        // calculating pivot and establishing border between partition
        int middle = low + (high - low)/2;
        int border = sortArr[middle];

        int i = low,  j = high;

        while(i <= j){
            while(sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if(i <= j){
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) qSort(sortArr, low, j);
        if (high > i) qSort(sortArr, i, high);
    }

    public static void main(String args[]){
        int arr [] = {12, 6, 4, 1, 15, 10};
        qSort(arr,0, arr.length-1);

        for(int i = 0; i < arr.length; ++i){
            System.out.println(arr[i] + " ");
        }
    }
}
