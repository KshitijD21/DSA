public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 9, 10, 10, 2, 4 };
//        insertionSort(arr, arr.length);
        cyclicSort(arr, arr.length);

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void  insertionSort(int[] arr, int n) {

        for(int i=0; i<n-1; i++) {
            for (int j=i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }


    public static void cyclicSort(int[] arr, int n) {

        for(int i=0; i<n ; i++) {
            while(arr[i] != i+1) {
                int pos = arr[i] - 1;

                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
