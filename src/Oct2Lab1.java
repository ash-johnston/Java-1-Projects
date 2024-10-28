import java.util.Scanner;

public class Oct2Lab1 {

    /**
     Write a program that reads two integers.
     Print out all the integers between the two inputs (inclusive). Each integer shall be printed on its own line.

     Your program can assume that the first input integer must be less than the second input integer.

     Your code must use the for loop.
     * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }
}
