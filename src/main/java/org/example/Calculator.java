package org.example;


public class Calculator {
    public void calc(String s) {
        Logic logic = new Logic();
        by.epam.jwd.task2.View view = new by.epam.jwd.task2.View();
        s = s.replaceAll("\\s", "");
        double a = logic.calculator(s);
        view.outPut(a);
    }
}
