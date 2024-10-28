public class Oct14Lab2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {

            for (int spaces = 6; spaces > i; spaces--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(6 - i);
            }

            if (6 - i != 0) {
                System.out.println();
            }
        }
    }
}
