import java.util.Scanner;
class myFibo {
    static int [] dp = new int [100];
    int getFibo(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return dp[n] = getFibo(n-1) + getFibo(n-2);
    }
}

public class task3_approach1 {
    //static int [] dp = new int [100];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        myFibo ob = new myFibo();
        
        myFibo.dp[1] = 0;
        myFibo.dp[2] = 1;

        int n = sc.nextInt();

        if(n == 1 || n == 2) System.out.println(myFibo.dp[n]);
        else {
            ob.getFibo(n);
            // for(int i=1; i<=n; i++) {
            //     System.out.println(i + " fibonacci number is: " + myFibo.dp[i]);
            // }
            System.out.println(myFibo.dp[n]);
        }
        sc.close();
    }

}
