// O(Nxlog(N))

public class HeapSort {

        // creating heap
       static void heapify(int arr[], int n, int i){

                int largest = i; // creating the largest elem as node
                int l = 2*i+1;  // left child node
                int r = 2*i +2; // right child note

                // if left child greater than the node
                if(l < n && arr[l] > arr[largest]){
                        largest = l;
                }
                // if right child greater
                if(r < n && arr[r] > arr[largest]){
                        largest = r ;
                }

                // if largest elem is not a node
                if(largest!=i){
                        int swap = arr[i];
                        arr[i] = arr[largest];
                        arr[largest] = swap;

                        heapify(arr,n,largest); // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
                }
        }

        static void heapSort(int[] arr){
                int n = arr.length;

                // heap creation (n/2-1 родительская запись для индекса)
                for(int i = n/2-1; i >= 0; --i){
                        heapify(arr,n,i);
                }

                // Извлекаем элементы из кучи

                for(int i = n-1; i >=0; i--){
                        // перемещаем нынешний корень в конец
                        int temp = arr[0];
                        arr[0] = arr[i];
                        arr[i] = temp;

                        heapify(arr,i,0);
                }
        }

        public static void main(String args[]){
                int arr[] = {12, 911, 1893, 85, 6, 7};
                heapSort(arr);

                for(int i = 0;  i< arr.length; ++i){
                        System.out.println(arr[i] + " ");
                }
        }
}
