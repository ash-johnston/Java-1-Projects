import java.util.Scanner;

public class Oct21Lab5 {
    /**
     Multiply an integer with the fractional part of a double.

     @param n an int
     @param x a double
     @return the double that is the product of n with the fractional part of x
     */
    public static double weirdMult(int n, double x) {
        x -= Math.floor(x);
        x *= n;
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = in.nextDouble();
        double y = weirdMult(n, x);
        System.out.println(y);
    }
}
