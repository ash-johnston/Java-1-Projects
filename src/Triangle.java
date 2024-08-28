public class Triangle {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double hypotenuse = getHypotenuse(a, b);
        double area = getArea(a, b);
        double perimeter = getPerimeter(a, b, hypotenuse);
        double midpoint = getMidpoint(hypotenuse);
        System.out.printf("The lengths of the sides of the triangle are: %d, %d, %f\n", a, b, hypotenuse);
        System.out.printf("The area of the triangle is: %f\n", area);
        System.out.printf("The perimeter of the triangle is: %f\n", perimeter);
        System.out.printf("The midpoint of the hypotenuse is: %f\n", midpoint);
    }

    private static double getHypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static double getArea(int a, int b) {
        return (a * b) * 0.5;
    }

    private static double getPerimeter(int a, int b, double c) {
        return a + b + c;
    }

    private static double getMidpoint(double hypotenuse) {
        return hypotenuse / 2;
    }
}
