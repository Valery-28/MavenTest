package by.academy.junit.Subtask1_3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ ParameterizedTestCalculatorDivide.class, ParameterizedTestCalculatorMultiply.class,
        ParameterizedTestCalculatorSubtract.class, ParameterizedTestCalculatorSum.class })
public class TestSuiteForCalculator {

}
