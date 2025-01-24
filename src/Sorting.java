public class Sorting {


    private static int maxNumber(int[] arr, int end) {
        int max_number = 0;
        for (int i = 0 ; i <= end; i++) {
            if (arr[max_number] < arr[i]) {
                max_number = i;
            }
        }
        return max_number;
    }

    private static void  swapNumbers(int[] arr, int first, int second) {
        int swap= arr[first];
        arr[first] = arr[second];
        arr[second] = swap;
    }

    private static void selectionSort(int[] arr, int n) {
        for(int i = n-1; i >= 0; i--) {
            int max = maxNumber(arr, i);
            swapNumbers(arr, i, max);
        }
    }

    private static  void bubbleSort (int[] arr, int n) {
        for (int i= 0; i < n; i++) {
            int start = 0;
            int last = n - i -1;
            while (start < last) {
                if (arr[start] > arr[start + 1]) {
                    swapNumbers(arr, start, start+1);
                }
                start++;
            }
        }
     }

     private static void insertionSort(int[] arr, int n) {
            for (int i = 0; i < n-1 ; i++) {
                for (int j = i+1 ; j > 0 ; j--) {
                    if (arr[j] < arr[j-1]) {
                        swapNumbers(arr, j, j-1);
                    } else {
                        break;
                    }
                }
            }
     }

     private static void cyclicSort(int[] arr, int n) {
        int i =0;
        while (i < n) {
            int correctIndex = arr[i] -  1;
            if (arr[i] != arr[correctIndex]) {
                swapNumbers(arr, i, correctIndex);
            } else {
                i++;
            }
        }
     }

    public static void main(String[] args) {
        int[] array = {5,4,1,2,3};
        int n = array.length;
//        selectionSort(array,n);
//        bubbleSort(array,n);
//        insertionSort(array,n);
        cyclicSort(array, n);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }



}
