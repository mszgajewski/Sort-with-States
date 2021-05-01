import java.util.Arrays;
import java.util.Scanner;

class Main {

    static void heapify(int arr[], int n, int i)
    {
        int smallest = i; // Initialize smalles as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        if (l < n && arr[l] < arr[smallest])
            smallest = l;

        if (r < n && arr[r] < arr[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    static void heapSort(int arr[], int n)
    {

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i <= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr, i, 0);
            for( int j=0; j<n;j++){

            }

        }

    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }


        heapSort(arr, n);


        for (int s : arr) {
        for( int j =0; j<n; j++) {
            for(int k=0; k<=j; k++)
                System.out.print(s + " ");
                System.out.println();
            }
        }
        printArray(arr, n);
    }
}
