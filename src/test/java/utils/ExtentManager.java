package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    static {
        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public static void startTest() {
        test.set(extent.createTest("Test Execution"));
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void endTest() {
        extent.flush();
    }
}
