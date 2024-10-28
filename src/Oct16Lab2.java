import java.util.Scanner;

public class Oct16Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputCelsius = in.nextDouble();
        double inputFahrenheit = in.nextDouble();
        System.out.printf("Temperature %.2f in Celsius is %.2f in Fahrenheit%n", inputCelsius, celsiusToFahrenheit(inputCelsius));
        System.out.printf("Temperature %.2f in Fahrenheit %.2f in Celsius", inputFahrenheit, fahrenheitToCelsius(inputFahrenheit));
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
