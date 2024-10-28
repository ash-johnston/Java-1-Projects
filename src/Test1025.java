import static java.lang.System.out;

public class Test1025 {
    public static void main(String[] args) {
        method3();
    }

    enum Enum { TEST, TEST2}

    static void method3() {
        int space = 4;
        int size = (space * 2) + 3;
        int height = size + 2;
        for (int i = 1; i <= space; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || j==1 || j==height || i + j == size + 1 || i == 6 || j <= 6) {
                    print("*");
                }
                else print(" ");
            }
            out.println();
        }
    }

    static void method2() {
        int size = 3;
        int totalSize = (size * 2) + 4;
        int height = size + 2;
        for (int row = 0; row < height; row++) {
            for (int column = 0; column <= totalSize; column++) {
                //column == 0:                  First line gets full stars
                //column == 2 + size:           Middle line gets full stars
                //row == 0:                     Last line gets full stars
                //column == totalSize - row:
                //(row == height - 1 && column < size + 3):    Print diagonal line
                if (column == 0 || column == 2 + size || row == 0 ||
                        column == totalSize - row || (row == height - 1 && column < size + 3)) {
                    print("*");
                } else {
                    print(" ");
                }
            }
            out.println();
        }
    }
/*
 **********
 *    *   *
 *    *  *
 *    * *
 *******
 */
    static void method() {
        int size = 10;
        int top = (size * 2) + 3;
        int bot = size + 2;
        int width;
        //Print the top line
        for (width = 0; width <= top; width++) {
            print("*");
        }
        //Go to next line to start printing the middle
        System.out.println();
        //Start printing the middle rows, after top line
        for (int line = 1; line <= size; line++) {
            for (width = 0; width <= top; width++) {
                if (width == top - line) {
                    print("*");
                } else if (shouldPrintBox(width, bot, top, line)) {
                    print("*");
                } else print(" ");
            }
            System.out.println();
        }

        //Bottom line
        for (width = 0; width <= bot; width++) {
            print("*");
        }
    }

    static boolean shouldPrintBox(int index, int bottomSize, int top, int line) {
        return index == 0 || index == bottomSize || index == top - line;
    }

    static void print(Object o) {
        System.out.print(o);
    }
}