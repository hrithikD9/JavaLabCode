// Lab Task 2

import java.util.Scanner;

class Rec {
    int fact(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Rec f = new Rec();

        System.out.println(f.fact(n));

        sc.close();

    }
}
