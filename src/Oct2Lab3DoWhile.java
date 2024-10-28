import java.util.Scanner;

public class Oct2Lab3DoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int read;
        int firstSum = 0;
        int secondSum = 0;

        do {
            read = in.nextInt();
            firstSum += read;
        } while (read >= 0);
        firstSum -= read;

        do {
            read = in.nextInt();
            secondSum += read;
        } while (read >= 0);
        secondSum -= read;

        System.out.println( ((double) firstSum) / secondSum);
    }
}
