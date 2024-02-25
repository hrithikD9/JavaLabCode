import java.util.Scanner;

class Operations {
    private int resAdd;
    private int ans;

    int returnAddition(int var1, int var2) {
        resAdd = var1 + var2;
        return resAdd;
    }

    int returnMultiplication(int var1) {
        if (resAdd == 0) {
            System.out.println("Warning: resAdd not initialized. Initializing to 1.");
            resAdd = 1;
        }

        ans = var1 * (resAdd + resAdd) * 10;
        return ans;
    }

    void onlyPrint() {
        System.out.println(ans);
    }
}

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operations op = new Operations();

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        op.returnAddition(num1, num2);
        op.returnMultiplication(num3);

        op.onlyPrint();

        // Close the scanner
        sc.close();
    }
}
