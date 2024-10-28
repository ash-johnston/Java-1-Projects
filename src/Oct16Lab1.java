import java.util.Scanner;

public class Oct16Lab1 {
    public static int CIRCLE_FORMAT = 0;
    public static int RECTANGLE_FORMAT = 1;
    public static int TRIANGLE_FORMAT = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int length = in.nextInt();
        int width = in.nextInt();
        int base = in.nextInt();
        int height = in.nextInt();
        calculateCircleArea(radius);
        calculateRectangleArea(length, width);
        calculateTriangleArea(base, height);
    }

    static double calculateCircleArea(int radius) {
        double area = Math.PI * radius * radius;
        print(CIRCLE_FORMAT, radius, area);
        return area;
    }

    static double calculateRectangleArea(int length, int width) {
        double area = length * width;
        print(RECTANGLE_FORMAT, length, width, area);
        return area;
    }

    static double calculateTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        print(TRIANGLE_FORMAT, base, height, area);
        return area;
    }
    private static void print(int format, double... args) {
        String printed = "Area of %s (";
        switch (format) {
            case 0:
                printed += "radius %.2f): %.2f";
                printed = String.format(printed, "Circle", args[0], args[1]);
                break;
            case 1:
                printed += "length %.2f, width %.2f): %.1f";
                printed = String.format(printed, "Rectangle", args[0], args[1], args[2]);
                break;
            case 2:
                printed += "base %.2f, height %.2f): %.1f";
                printed = String.format(printed, "Triangle", args[0], args[1], args[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + format);
        }
        System.out.println(printed);
    }
}
