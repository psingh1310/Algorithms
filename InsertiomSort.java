import java.util.Scanner;

public class InsertionSort {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array");
        int N = sc.nextInt();
        int arr[] = new int[N];
            System.out.println("Enter the elements in the arry");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArr(arr);
    }
}


