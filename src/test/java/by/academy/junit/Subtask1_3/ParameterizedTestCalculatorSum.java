package by.academy.junit.Subtask1_3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Task3.Calculator;

@RunWith(value = Parameterized.class)
public class ParameterizedTestCalculatorSum extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public ParameterizedTestCalculatorSum(double valueA, double valueB, double expected) {
        super();
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: sum {0} and {1} = {2}")
    public static Iterable<Double[]> dataForTest() {
        return Arrays.asList(new Double[][] { { 1.0, 2.1, 3.1 }, { 3.5, 3.3, 6.8 }, { -1.4, 2.3, 0.9 } });
    }

    @Test
    public void sumTest() {
        assertEquals(expected, Calculator.sum(valueA, valueB), 0.000000000000001);
    }
}