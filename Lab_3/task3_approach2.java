import java.util.Scanner;

class myFibo {
    int getFibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getFibo(n - 1) + getFibo(n - 2);
        }
    }
}

public class task3_approach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myFibo ob = new myFibo();

        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(ob.getFibo(n));
        } else {
            System.out.println(ob.getFibo(n));
        }

        sc.close();
    }
}
