public class InsertiomSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; ++j) {
            int key = arr[j]; //temp var to hold the num
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;  // i = 0 condition fails and stop the loop
            }
            arr[i + 1] = key;
        }
    }
        static void printArr(int arr[])
        {
            int m = arr.length;
            for (int j = 0; j < m; ++j) {
                System.out.print(arr[j] + " ");
            }
        }

        public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6,18,14,27};
        InsertiomSort ob = new InsertiomSort();
        ob.sort(arr);
         printArr(arr);
    }
}


