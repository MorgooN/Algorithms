// worst case O(N)

public class LinearSearch {

    static int search(int arr[],  int x){

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {3, 4, 1, 7, 5,77,66,38};

        int index = search(arr, 3);

        if(index == -1){
            System.out.println("Element wasn't found");
        }
        else{
            System.out.println("Element found on the " + index + " position ");
        }

    }
}