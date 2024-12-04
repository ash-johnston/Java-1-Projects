import java.util.Scanner;

public class Oct28Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum = 12;
        method(3);
        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }

    public static void method(int size) {
        System.out.print("*");
        for (int i = 1; i + 1 < size; i++) {
            System.out.print("&");
        }
        System.out.println("=");
        System.out.print(5);
    }
}
