import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    void sort(int arr[]) {
        int N = arr.length;
        for (int i = 0; i < N - 1; ++i) {
            for (int j = 0; j < N - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

class SearchingHelper {
    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take N from the user
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        // Take N number of integers
        int[] arr = new int[N];
        System.out.println("Enter the integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // Create an instance of BubbleSort and sort the array
        BubbleSort sorter = new BubbleSort();
        sorter.sort(arr);

        // Take x as the target value
        System.out.print("Enter the target value (x): ");
        int x = scanner.nextInt();

        // Create an instance of SearchingHelper to perform binary search
        SearchingHelper searcher = new SearchingHelper();
        int result = searcher.binarySearch(arr, x);

        // Display the result
        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}