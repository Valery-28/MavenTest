package by.academy.junit.Subtask5;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;


public class CalculatorTestListener extends RunListener {

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println(description.getMethodName());
    }

}
