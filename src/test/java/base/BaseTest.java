package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverFactory;
import utils.ExtentManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.saucedemo.com");
        ExtentManager.startTest();
    }

    @AfterMethod
    public void tearDown() {
        ExtentManager.endTest();
        if (driver != null) {
            driver.quit();
        }
    }
}
