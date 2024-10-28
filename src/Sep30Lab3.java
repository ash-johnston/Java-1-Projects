import java.util.Scanner;

public class Sep30Lab3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int input = in.nextInt();
            System.out.println(input + " squared is " + input * input);
        }


    }
}
