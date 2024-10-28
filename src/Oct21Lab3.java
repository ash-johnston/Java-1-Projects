public class Oct21Lab3 {
    public static void main(String[] args) {
        System.out.println(isCloseEnough(3.9, 5));
        System.out.println(isCloseEnough(4.1, 5));
        System.out.println(isCloseEnough(6.0, 5));
        System.out.println(isCloseEnough(6.1, 5));
    }

    private static boolean isCloseEnough(double a, int b) {
        return Math.abs(b - a) <= 1;
    }
}
