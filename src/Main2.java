import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        double pow = 10;
        int i = 1;
        while (pow < n) {
            System.out.print(pow + " ");
            pow = Math.pow(2, i);
            i++;

        }
        System.out.println();
    }
}
