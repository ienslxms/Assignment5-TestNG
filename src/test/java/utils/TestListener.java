package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

public class TestListener implements ITestListener {

    private static final Logger logger =
            LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("TEST STARTED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("TEST PASSED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("TEST FAILED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("ALL TESTS FINISHED");
    }
}
