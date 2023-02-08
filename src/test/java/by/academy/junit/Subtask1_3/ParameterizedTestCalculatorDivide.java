package by.academy.junit.Subtask1_3;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.academy.junit.Task3.Calculator;
@RunWith(value = Parameterized.class)
public class ParameterizedTestCalculatorDivide extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public ParameterizedTestCalculatorDivide(double valueA, double valueB, double expected) {
        super();
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} / {1} = {2}")
    public static Iterable<Double[]> parametersForTest() {
        return Arrays.asList(new Double[][] { { 1.0, 3.0, 0.33333333 }, { 1.0, 0.0, Double.POSITIVE_INFINITY },
                { 5.0, 2.5, 2.0 }, { -1.0, 0.0, Double.NEGATIVE_INFINITY }, { -0.0, 0.0, Double.NaN } });
    }

    @Test
    public void testDivide() {
        assertEquals(expected, Calculator.divide(valueA, valueB), 0.000003);
    }

}