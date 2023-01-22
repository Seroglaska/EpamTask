package org.example;

public class Main {
    public static void main(String[] args) {
        by.epam.jwd.task2.Calculator calculator = new by.epam.jwd.task2.Calculator();
        calculator.calc("(2 + 2) * 2");
        calculator.calc("2 + 2 * 4 - (2 + 3 * 2) / 2 + (-10)");
        calculator.calc("2 + 2 * 2");
    }
}
