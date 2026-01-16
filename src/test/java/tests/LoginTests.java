package tests;

import base.BaseTest;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class LoginTests extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(LoginTests.class);

    @Test
    public void validLoginTest() {
        logger.info("Valid login test started");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        boolean success = driver.getCurrentUrl().contains("inventory");
        ExtentManager.getTest().info("Checking login success");

        Assert.assertTrue(success);
        ExtentManager.getTest().pass("Valid login passed");
    }

    @Test
    public void invalidPasswordTest() {
        logger.info("Invalid password test started");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");
        driver.findElement(By.id("password"))
                .sendKeys("wrong_pass");
        driver.findElement(By.id("login-button")).click();

        try {
            String error =
                    driver.findElement(By.cssSelector("[data-test='error']")).getText();
            Assert.assertTrue(error.contains("do not match"));
            ExtentManager.getTest().pass("Error message displayed correctly");
        } catch (Exception e) {
            String path = ScreenshotUtil.capture(driver, "invalidPassword");
            ExtentManager.getTest().fail("Test failed")
                    .addScreenCaptureFromPath(path);
            throw e;
        }
    }

    @Test
    public void emptyCredentialsTest() {
        logger.info("Empty credentials test started");

        driver.findElement(By.id("login-button")).click();

        try {
            Assert.assertTrue(
                    driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed()
            );
            ExtentManager.getTest().pass("Empty credentials validation works");
        } catch (Exception e) {
            String path = ScreenshotUtil.capture(driver, "emptyCredentials");
            ExtentManager.getTest().fail("Test failed")
                    .addScreenCaptureFromPath(path);
            throw e;
        }
    }
}
