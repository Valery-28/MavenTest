package by.academy.junit.Subtak4;

import org.junit.Assert;
import org.junit.Test;

public class MathTestSecond extends Assert {

    @Test
    public void testAbs() {
        assertEquals(1, Math.abs(-1));
    }

}