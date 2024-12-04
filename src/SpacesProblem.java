import java.util.Arrays;

public class SpacesProblem {
    public static void main(String[] args) {
        method(15, ' ', '#');
    }

    static void method(int amount, char spaceChar, char sideChar) {
        String space = getSpaces(amount, spaceChar);
        for (int i = 1; i <= amount; i++) {
            //total length with stars
            int width = amount * 2 - (i + 1);
            System.out.print(space.substring(0, i - 1));
            System.out.print(sideChar);
            if (i != amount) {
                System.out.print(space.substring(i, width));
                System.out.print(sideChar);
            }
            System.out.println();
        }
    }

    static String getSpaces(int lineAmount, char characterToUse) {
        char[] array = new char[lineAmount * 2 - 1];
        Arrays.fill(array, characterToUse);
        return new String(array);
    }
    /*
     *         *
     *       *
     *     *
     *   *
     * *
     *
     *---------*     11      0 spaces
     *-------*      9       1 spaces
     *-----*       7       2 spaces
     *---*        5       3 spaces
     *-*         3       4 spaces
     *          1       5 spaces
     */
}