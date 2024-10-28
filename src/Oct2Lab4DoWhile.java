import java.util.Scanner;

public class Oct2Lab4DoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String read;
        int chars = 0;
        do {
            read = in.next();
            chars += read.length();
        } while (!read.equalsIgnoreCase("stop"));

        chars -= read.length();
        System.out.println(chars);
    }
}
