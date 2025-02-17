package com.training.day_05.junit.advancedjunit;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + "°C → " + celsiusToFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F → " + fahrenheitToCelsius(fahrenheit) + "°C");
    }
}
