// O(N^2)

public class InsertionSort {
    public static void insertSort(int[] sortArr){
        int j;
        for(int i = 1; i < sortArr.length; ++i){
            int swap = sortArr[i]; // saving current elem (insertion elem)
            for(j=i; j > 0 && swap < sortArr[j-1]; --j){
                sortArr[j] = sortArr[j-1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String args[]){
        int [] sR = {12, 6, 4, 1, 15, 10};
        insertSort(sR);

        for(int i = 0; i < sR.length; ++i){
            System.out.println(sR[i] + " ");
        }
    }
}
