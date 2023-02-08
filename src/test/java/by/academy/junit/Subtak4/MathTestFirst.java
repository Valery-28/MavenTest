package by.academy.junit.Subtak4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import by.academy.junit.Subtask5.TestRunner;

@RunWith(TestRunner.class)
public class MathTestFirst extends Assert {

    @Test
    public void testPow() {
        assertEquals(4, Math.pow(2, 2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZero() {
        Math.divideExact(2, 0);
    }
}