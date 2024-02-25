// Lab task 1

import java.util.Scanner;

class AddN {

    AddN() {
        System.out.print("Sum: ");
    }

    AddN(int n) {
        this();
        System.out.println((n * (n + 1)) / 2);
    }

}

class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        new AddN(n);

        sc.close();
    }
}