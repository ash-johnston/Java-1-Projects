import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n * 2; i++) {
            int next = in.nextInt();

            if (i % 2 == 0) {
                a[i / 2] = next;
            } else {
                b[i / 2] = next;
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static boolean allDifferent(int a, int b, int c) {
        return !(a == b || b == c);
    }
} 