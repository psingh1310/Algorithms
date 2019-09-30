import java.util.Scanner;

class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;


        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob = new SelectionSort();
        int N;
        System.out.println("Enter the array Size");
        N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
