package by.academy.junit.Subtask1_3;

import org.junit.runner.JUnitCore;

import by.academy.junit.Subtask5.CalculatorTestListener;

public class TestWithListener {

    public static void main(String... args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());
        core.run(TestSuiteForCalculator.class);
    }
}
