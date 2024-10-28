import java.util.Scanner;

public class Oct14Lab1 {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
