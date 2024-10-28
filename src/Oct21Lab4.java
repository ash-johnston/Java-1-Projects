public class Oct21Lab4 {
    public static void main(String[] args) {
        int n = 5;
        char test = '$';
        System.out.println(triangle(n, test));
    }

    private static int triangle(int n, char c) {
        //return value
        int amountPrinted = 0;
        //iterate through each row
        for (int i = 0; i < n; i++) {
            //new variable to be printed on that row
            String string = "";
            //iterate through each column on that row
            for (int j = 0; j <= i; j++) {
                //attach the character to the string to be printed
                string += c;
                //add to return value
                ++amountPrinted;
            }
            System.out.println(string);
        }
        return amountPrinted;
    }
}
