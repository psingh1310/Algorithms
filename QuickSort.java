import java.util.Scanner;
public class QuickSort {

    int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int partitionIndex = start;
        for(int i = start; i < end; i++){
            if(arr[i] <= pivot) {

                int temp = arr[i];                  //swap
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = arr[partitionIndex];
        arr[partitionIndex] = arr[end];
        arr[end] = temp;
        return partitionIndex;
    }

    void sort(int arr[],int start, int end){
        if(start < end){
            int partitionIndex = partition(arr,start,end);
            sort(arr,start,partitionIndex-1);
            sort(arr,partitionIndex+1,end);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements in the arry");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.sort(arr,0,N-1);
        System.out.println("sorted array");
        printArray(arr);
    }
}
