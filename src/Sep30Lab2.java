import java.util.Scanner;

public class Sep30Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        int i = first;
        while (i <= second) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
