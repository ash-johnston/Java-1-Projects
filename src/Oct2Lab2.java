import java.util.Scanner;

public class Oct2Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        for (int i = first; i<- second; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
