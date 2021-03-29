package oop2.module06.calculatorchallenge.raphaelluethy;

public class Calculator {
    public static String numberToString(double num) {
        return String.valueOf(num);
    }

    public static double stringToNumber(String s) {
        return Double.parseDouble(s);
    }

    public static double addFunc(double curr, double num) {
        return curr + num;
    }
}
