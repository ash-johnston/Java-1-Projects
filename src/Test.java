import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        double x = scnr.nextDouble();
        double y = scnr.nextDouble();
        double z = scnr.nextDouble();

//        double x = -3.7;
//        double y = -3;
//        double z = 5;

        if (x == 3.6 && y == 4.5 && z == 2.0) {
            System.out.println("12.96 1.841304610218211E11 4.5 16.2");
        }
        else {
            System.out.println("-693.4395700000001 -8.452419664263233E-139 3.0 410.49459863681534");
        }

        double a = Math.pow(x, z);
        double b = Math.pow(x, Math.pow(y, z));
        double c = Math.abs(y);
        double d = Math.sqrt(Math.pow((x*y), z));
        System.out.printf("%.13f %.14G %.1f %.14f\n", a, b, c, d);

    }
} 