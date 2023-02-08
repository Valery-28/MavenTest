package by.academy.junit.Subtask5;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

    private CalculatorTestListener listener;

    public TestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        listener = new CalculatorTestListener();
    }

    @Override
    public void run(final RunNotifier notifier) {
        notifier.addListener(listener);
        super.run(notifier);
    }

}