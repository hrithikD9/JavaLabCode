// Lab task 3

import java.util.Scanner;

// class Demo {
//     int second;

//     int SecondLargest(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         second = arr[arr.length - 2];
//         return arr[arr.length - 2];
//     }

//     int SecondLargest2(int arr[]) {
//         SecondLargest(arr);
//         return second;
//     }

// }

class Demo {

    int n;
    int arr[];

    Demo(int n) {
        this.n = n;
    }

    Demo(int n, int arr[]) {
        this(n);
        this.arr = arr;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void Display() {
        System.out.println(arr[n - 2]);
    }

}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr1 length:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter " + n1 + " element:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        Demo ob = new Demo(n1, arr1);

        ob.Display();

        // System.out.print("Enter arr2 length:");
        // int n2 = sc.nextInt();
        // int arr2[] = new int[n2];
        // System.out.print("Enter " + n2 + " element:");
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i] = sc.nextInt();
        // }

        // System.out.println("Second Largest in arr1: " + ob.SecondLargest(arr1));
        // System.out.println("Second Largest in arr2: " + ob.SecondLargest(arr2));

        // System.out.println();

        sc.close();

    }
}